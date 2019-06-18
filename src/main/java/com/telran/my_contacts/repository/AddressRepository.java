package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.Address;
import com.telran.my_contacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByUserId(Long id);
}
