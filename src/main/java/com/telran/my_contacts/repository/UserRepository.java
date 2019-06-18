package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select usr.id from User usr")
    List<Long> getAllContacts();
    List<User> findAllByFullName(String fullName);
}
