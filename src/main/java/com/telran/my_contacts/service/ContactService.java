package com.telran.my_contacts.service;

import com.telran.my_contacts.model.dto.ContactDto;


import java.util.List;


public interface ContactService {

    void addContact(ContactDto contactDto);

    ContactDto getContact(Long id);

    void updateContact(Long id, ContactDto contactDto);

    void deleteContact(Long id);

    ContactDto getContactsByName(String fullName);

    ContactDto getContactsByPhone(String phoneNumber);

    List<ContactDto> getAllContacts();




}
