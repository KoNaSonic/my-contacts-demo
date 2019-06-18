package com.telran.my_contacts.service;

import com.telran.my_contacts.model.dto.ContactDto;
import com.telran.my_contacts.model.entity.PhoneNumber;
import com.telran.my_contacts.model.entity.User;


import java.util.List;


public interface ContactService {

//    void addContact(ContactDto contactDto);
//
//    ContactDto getContact(Long id);
//
//    void updateContact(Long id, ContactDto contactDto);
//
//    void deleteContact(Long id);

    List<ContactDto> getAllContactsByName(String fullName);

    List<ContactDto> getAllContactsByPhoneNumber(String phoneNumber);

//    ContactDto getContactsByPhone(String phoneNumber);
//
    List<ContactDto> getAllContacts();




}
