package com.edu.icesi.restzooregisters.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date arrivalDate;
    private UUID fatherID;
    private UUID motherID;

}
