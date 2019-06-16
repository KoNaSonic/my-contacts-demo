package com.telran.my_contacts.service;

import com.telran.my_contacts.model.dto.ContactDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    ContactDto getContact(Long id);

    List<ContactDto> getAllContacts();

    List<ContactDto> getAllContactsByName(String name);

    List<ContactDto> getAllContactsByPhone(String phone);

    void createContact(ContactDto contactDto);

    void deleteContact(Long id);


}
