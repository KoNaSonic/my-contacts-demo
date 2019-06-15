package com.telran.my_contacts.model.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;


import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class AddressDto {

    @NotBlank
    private String country;

    @NotBlank
    private String city;

    @NotBlank
    private String street;

    @NotBlank
    private String houseNumber;

    @NotBlank
    private String apartment;

}
