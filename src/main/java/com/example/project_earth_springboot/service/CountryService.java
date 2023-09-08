package com.example.project_earth_springboot.service;

import com.example.project_earth_springboot.model.dto.mapper.CountryMapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CountryService {

    public static void main(String[] args) throws IOException {
        CountryService countryService = new CountryService();
        String[] arr = countryService.fromByName("Russian").replaceAll("(?U)[^\\p{L}\\p{N}\\s]+", "\"").split("\"");
                //.replaceAll("\\W", "\"")
//                .split("\"");
//        List<String> arr2 = new ArrayList<>();
//        for (String s: arr){
//            if (!s.equals("")){
//              arr2.add(s);
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("name")) {
//                name = arr[i+2];
//            } else if (arr[i].equals("official")) {
//
//            }
//
//        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public String fromByName(String name) throws IOException {
        URL url = new URL("https://restcountries.com/v3.1/name/"+name);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return String.valueOf(response);
    }

    public String fromByCapital(String capital) throws IOException {
        URL url = new URL("https://restcountries.com/v3.1/capital/"+capital);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return String.valueOf(response);
    }

    public String fromByCurrency(String curr) throws IOException {
        URL url = new URL("https://restcountries.com/v3.1/currency/"+curr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return String.valueOf(response);
    }

    public String fromByRegion(String region) throws IOException {
        URL url = new URL("https://restcountries.com/v3.1/currency/"+region);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return String.valueOf(response);
    }
}
