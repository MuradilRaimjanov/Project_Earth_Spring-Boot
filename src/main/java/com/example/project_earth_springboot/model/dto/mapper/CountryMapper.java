package com.example.project_earth_springboot.model.dto.mapper;

import com.example.project_earth_springboot.model.dto.CountryResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapper {

    public CountryResponse mapToResponse(String result) {
        String[] arr = result
                .split("\"");
        List<String> arrRes = List.of(arr[5], arr[9], arr[57], arr[109], arr[436]);
        long population = Long.parseLong(arrRes.get(4).replaceAll("\\D", ""));
        return CountryResponse.builder()

                .name(arrRes.get(0))
                .fullName(arrRes.get(1))
                .currency(arrRes.get(2))
                .language(arrRes.get(3))
                .population(population)
                .build();
    }
}
