package com.example.validation.dto;

import com.example.validation.annotation.YearMonth;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Getter @Setter @ToString
public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    @Valid
    private List<Car> cars;
}
