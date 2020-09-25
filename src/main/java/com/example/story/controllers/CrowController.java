package com.example.story.controllers;

import com.example.story.repos.CrowsRepo;
import com.example.story.object.Crow;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CrowController {
    private final CrowsRepo crowsRepo;

    public CrowController(CrowsRepo crowsRepo){
        this.crowsRepo = crowsRepo;
    }

    public void createCrow(String name) {
        if(checkExistByName(name))
            throw new IllegalArgumentException("This name number already exists");
        int energy=10;
        int sizeMind=20;
        Date date= new Date();
        Crow crow= new Crow(name, date, energy,sizeMind);
        crowsRepo.save(crow);

        System.out.println("\u001B[33m" + "New crow"+ crow.getName() +" added" + "\u001B[0m");
    }

    public Crow getCrowByName(String name) throws IllegalArgumentException {
        List<Crow> foundCrows = crowsRepo.findByName(name);

        if(foundCrows.size() == 0){
            throw new IllegalArgumentException("Crow not found");
        }

        return foundCrows.get(0);
    }

    public boolean checkExist(UUID crowId){
        return crowsRepo.existsById(crowId);
    }

    public boolean checkExistByName(String name){
        return crowsRepo.existsByName(name);
    }
}


