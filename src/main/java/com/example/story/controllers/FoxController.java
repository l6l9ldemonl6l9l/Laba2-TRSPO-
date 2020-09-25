package com.example.story.controllers;

import com.example.story.object.Fox;
import com.example.story.repos.FoxsRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class FoxController {
    private final FoxsRepo foxsRepo;

    public FoxController(FoxsRepo foxsRepo){
        this.foxsRepo = foxsRepo;
    }

    public void createFox(String name) {
        if(checkExistByName(name))
            throw new IllegalArgumentException("This name number already exists");
        int energy=10;
        int sizeMind=20;
        Date date= new Date();
        Fox fox= new Fox(name, date, energy,sizeMind);
        foxsRepo.save(fox);

        System.out.println("\u001B[33m" + "New Fox"+ fox.getName() +" added" + "\u001B[0m");
    }

    public Fox getFoxByName(String name) throws IllegalArgumentException {
        List<Fox> foundFoxs = foxsRepo.findByName(name);

        if(foundFoxs.size() == 0){
            throw new IllegalArgumentException("Fox not found");
        }

        return foundFoxs.get(0);
    }

    public boolean checkExist(UUID FoxId){
        return foxsRepo.existsById(FoxId);
    }

    public boolean checkExistByName(String name){
        return foxsRepo.existsByName(name);
    }
}

