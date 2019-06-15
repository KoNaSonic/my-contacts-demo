package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
