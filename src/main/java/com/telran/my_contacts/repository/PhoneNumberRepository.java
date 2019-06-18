package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.PhoneNumber;
import com.telran.my_contacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {

    List<PhoneNumber> findAllByPhoneNumber(String phoneNumber);
    List<PhoneNumber> findAllByUser(User user);

}
