package com.edu.icesi.restzooregisters.controller;

import com.edu.icesi.restzooregisters.api.RestZooRegistersAPI;
import com.edu.icesi.restzooregisters.dto.AnimalDTO;
import com.edu.icesi.restzooregisters.mapper.AnimalMapper;
import com.edu.icesi.restzooregisters.service.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class AnimalController implements RestZooRegistersAPI {

    public final AnimalService animalService;
    public final AnimalMapper animalMapper;

    @Override
    public AnimalDTO getAnimal(String animalName) {
        return animalMapper.fromAnimal(animalService.getAnimal(animalName));
    }

    @Override
    public AnimalDTO createAnimal(AnimalDTO animalDTO) {
        return animalMapper.fromAnimal(animalService.createAnimal(animalMapper.fromDTO(animalDTO)));
    }

    @Override
    public List<AnimalDTO> getAnimals() {
        return animalService.getAnimals().stream().map(animalMapper::fromAnimal).collect(Collectors.toList());
    }
}
