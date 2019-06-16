package com.telran.my_contacts.controller;


import com.telran.my_contacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")

public class ContactController {

    @Autowired
    public UserRepository userRepository;


//    public User add( @RequestBody UserRepository user){
//
//
//    }
//
//    public  User getById (@PathVariable ("Id") String id){
//
//    };
//
//    public  User deleteById (@PathVariable ("Id") String id){
//
//
//    };

}
