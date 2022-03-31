package com.rasacode.carrental.model;

import com.rasacode.carrental.enumeration.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetName;
    private String houseNumber;
    private String flatNumber;
    private String city;
    private String zipCode;
    @Enumerated(EnumType.STRING)
    private Country country;
    private String phone;
}