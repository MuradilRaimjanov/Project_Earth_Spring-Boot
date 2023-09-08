package com.example.project_earth_springboot.model.dto;

import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountryRequest {

    String name;

    String fullName;

    String currency;

    String language;

    String borders;

    long population;

    String timezone;

}
