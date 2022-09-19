package com.edu.icesi.restzooregisters.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {

    private UUID id;
    private String name;
    private boolean sex;
    private double weight;
    private int age;
    private double height;
    private Date arrivalDate;

}
