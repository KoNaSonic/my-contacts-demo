package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, String> {
}
