package com.telran.my_contacts.service;

import com.telran.my_contacts.model.dto.ContactDto;
import com.telran.my_contacts.model.entity.Address;
import com.telran.my_contacts.model.entity.PhoneNumber;
import com.telran.my_contacts.model.entity.User;
import com.telran.my_contacts.repository.AddressRepository;
import com.telran.my_contacts.repository.PhoneNumberRepository;
import com.telran.my_contacts.repository.UserRepository;
import com.telran.my_contacts.util.ConverterToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    ConverterToDto converterToDto;



//    @Override
//    public void addContact(ContactDto contactDto) {
//
//    }
//

    public ContactDto getContact(Long id) {
        User user = userRepository.findById(id).orElseThrow(null);
        List<Address> address = addressRepository.findAllByUserId(user.getId());
        List<PhoneNumber> phoneNumber = phoneNumberRepository.findAllByUser(user);
        return converterToDto.convertUserEntityToContactDTO(user, address, phoneNumber);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        List<Long> ids = userRepository.getAllContacts();
        return ids.stream().map(id -> getContact(id)).collect(Collectors.toList());
    }

    @Override
    public List<ContactDto> getAllContactsByPhoneNumber(String phoneNumber) {
        List<PhoneNumber> phoneNumbers = phoneNumberRepository.findAllByPhoneNumber(phoneNumber);
        return phoneNumbers.stream().map(phone -> getContact(phone.getUser().getId())).collect(Collectors.toList());
    }


    @Override
    public List<ContactDto> getAllContactsByName(String fullName) {
        List<User> users = userRepository.findAllByFullName(fullName);
//        return users.stream().map(user -> converterToDto.convertUserEntityToContactDTO(user)).collect(Collectors.toList());
        return users.stream().map(user -> getContact(user.getId())).collect(Collectors.toList());
    }


//
//    @Override
//    public void updateContact(Long id, ContactDto contactDto) {
//
//    }
//
//    @Override
//    public void deleteContact(Long id) {
//
//    }







}
