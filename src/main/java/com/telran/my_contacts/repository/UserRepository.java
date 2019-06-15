package com.telran.my_contacts.repository;

import com.telran.my_contacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
