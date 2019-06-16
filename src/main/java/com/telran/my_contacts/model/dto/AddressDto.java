package com.telran.my_contacts.model.dto;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class AddressDto {


    private String country;

    private String city;

    private String street;

    private String houseNumber;

    private String apartment;

}
