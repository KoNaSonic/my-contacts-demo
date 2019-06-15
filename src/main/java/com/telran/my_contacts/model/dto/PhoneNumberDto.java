package com.telran.my_contacts.model.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class PhoneNumberDto {

    @NotBlank
    private String phoneNumber;


}
