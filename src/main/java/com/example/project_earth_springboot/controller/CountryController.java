package com.example.project_earth_springboot.controller;


import com.example.project_earth_springboot.model.dto.CountryResponse;
import com.example.project_earth_springboot.model.dto.mapper.CountryMapper;
import com.example.project_earth_springboot.service.CountryService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/country")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CountryController {

    CountryService countryService;

    CountryMapper countryMapper;

    @GetMapping("/by_name")
    public CountryResponse getCountryByName(@RequestParam(value = "name") String name) throws IOException {
            String res = countryService.fromByName(name);
            return countryMapper.mapToResponse(res);

    }

    @GetMapping("/by_capital")
    public CountryResponse getCountryByCapital(@RequestParam(value = "capital") String name) throws IOException {
        String res = countryService.fromByCapital(name);
        return countryMapper.mapToResponse(res);

    }

    @GetMapping("/by_currency")
    public CountryResponse getCountryByCurrency(@RequestParam(value = "currency") String name) throws IOException {
        String res = countryService.fromByCurrency(name);
        return countryMapper.mapToResponse(res);

    }

    @GetMapping("/by_region")
    public CountryResponse getCountryByRegion(@RequestParam(value = "region") String name) throws IOException {
        String res = countryService.fromByRegion(name);
        return countryMapper.mapToResponse(res);

    }
}
