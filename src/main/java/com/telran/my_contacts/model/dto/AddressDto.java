package com.telran.my_contacts.model.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;





@AllArgsConstructor
@NoArgsConstructor
@Data

public class AddressDto {


    private String country;


    private String city;


    private String street;


    private String houseNumber;


    private String apartment;

}
