package com.example.project_earth_springboot.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countries")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @Column(name = "fill_name")
    String fullName;

    String currency;

    String language;

    String borders;

    long population;

    String timezone;

}
