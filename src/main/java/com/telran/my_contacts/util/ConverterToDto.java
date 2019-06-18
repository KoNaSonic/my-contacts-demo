package com.telran.my_contacts.util;

import com.telran.my_contacts.model.dto.AddressDto;
import com.telran.my_contacts.model.dto.ContactDto;
import com.telran.my_contacts.model.entity.Address;
import com.telran.my_contacts.model.entity.PhoneNumber;
import com.telran.my_contacts.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConverterToDto {

    public ContactDto convertUserEntityToContactDTO(User user, List<Address> addresses, List<PhoneNumber> phoneNumbers) {
        return ContactDto.builder().fullName(user.getFullName()).email(user.getEmail())
                .phoneNumbers(phoneNumbers.stream()
                        .map(PhoneNumber::getPhoneNumber).collect(Collectors.toList()))
                .addresses(addresses.stream()
                        .map(address -> convertAddressEntityToAddressDTO(address)).collect(Collectors.toList()))
                .build();
    }

    public AddressDto convertAddressEntityToAddressDTO(Address address) {
        return AddressDto.builder()
                .country(address.getCountry())
                .city(address.getCity())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .apartment(address.getApartment())
                .build();
    }
}