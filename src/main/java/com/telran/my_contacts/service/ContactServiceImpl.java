package com.telran.my_contacts.service;

import com.telran.my_contacts.model.dto.ContactDto;
import com.telran.my_contacts.repository.AddressRepository;
import com.telran.my_contacts.repository.PhoneNumberRepository;
import com.telran.my_contacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;




    @Override
    public void addContact(ContactDto contactDto) {

    }

    @Override
    public ContactDto getContact(Long id) {
        return null;
    }

    @Override
    public void updateContact(Long id, ContactDto contactDto) {

    }

    @Override
    public void deleteContact(Long id) {

    }

    @Override
    public ContactDto getContactsByName(String fullName) {
        return null;
    }

    @Override
    public ContactDto getContactsByPhone(String phoneNumber) {
        return null;
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return null;
    }
}
