package com.telran.my_contacts.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder

@Table(name = "addresses")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;

    private LocalDateTime createdDate;

    private String country;

    private String city;

    private String street;

    private String houseNumber;

    private String apartment;

}
