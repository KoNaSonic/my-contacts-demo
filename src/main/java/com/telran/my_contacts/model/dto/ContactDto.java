package com.telran.my_contacts.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class ContactDto {

    @NotBlank
    @Length(min = 2, max = 50)
    private String fullName;

    @Email
    @NotBlank
    private String email;

    private List<String> phoneNumbers;

    private List<AddressDto> addresses;

}
