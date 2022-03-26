package com.example.httpapi.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CarDto {
    private String name;
    private String carNumber;

    @Override
    public String toString() {
        return "CarDto{" +
                "name='" + name + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
