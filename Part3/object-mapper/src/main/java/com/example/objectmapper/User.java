package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    @JsonProperty("phone_number")
    private String phoneNumber;
}
