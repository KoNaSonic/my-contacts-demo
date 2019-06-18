package com.telran.my_contacts.controller;


import com.telran.my_contacts.model.dto.ContactDto;
import com.telran.my_contacts.model.entity.PhoneNumber;
import com.telran.my_contacts.model.entity.User;
import com.telran.my_contacts.repository.UserRepository;
import com.telran.my_contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class ContactController {

    @Autowired
    private ContactService contactService;



//    @PostMapping("/contacts")
//    public void addContact(@RequestBody ContactDto contactDto) {
//        contactService.addContact(contactDto);
//    }
//
    @GetMapping("/contacts")
    public List<ContactDto> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/getAllContactsByName")
    public List<ContactDto> getAllContactsByName(@RequestParam(name = "name") String fullName) {
        return contactService.getAllContactsByName(fullName);
    }

    @GetMapping("/getAllContactsByPhoneNumber")
    public List<ContactDto> getAllContactsByPhoneNumber(@RequestParam(name = "number") String phonenumber) {
        return contactService.getAllContactsByPhoneNumber(phonenumber);
    }

//    @GetMapping("/contacts/{id}")
//    public ContactDto getContact(Long id) {
//        return contactService.getContact(id);
//    }
//
//    @PutMapping("/contacts")
//    public void updateContact(@RequestBody Long Id, ContactDto contactDto) {
//        contactService.updateContact(Id, contactDto);
//    }
//
//    @DeleteMapping("/contacts/{id}")
//    public void deleteContact(@PathVariable(name = "id") Long userId) {
//        contactService.deleteContact(userId);
//    }



}
