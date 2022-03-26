package com.example.httpapi.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PutRequestDto {
    private String name;
    private String age;
    private List<CarDto> carList;

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", carList=" + carList +
                '}';
    }
}
