package com.example.story.controllers;

import com.example.story.object.Deity;
import com.example.story.repos.DeityRepo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class DeityController {
    private final DeityRepo deityRepo;

    public DeityController(DeityRepo deityRepo){
        this.deityRepo = deityRepo;
    }

    public void createDeity(String name) {
        if(checkExistByName(name))
            throw new IllegalArgumentException("This name number already exists");
        Date date= new Date();
        Deity Deity= new Deity(name, date);
        deityRepo.save(Deity);

        System.out.println("\u001B[33m" + "New Deity"+ Deity.getName() +" added" + "\u001B[0m");
    }

    public Deity getDeityByName(String name) throws IllegalArgumentException {
        List<Deity> foundDeity = deityRepo.findByName(name);

        if(foundDeity.size() == 0){
            throw new IllegalArgumentException("Deity not found");
        }

        return foundDeity.get(0);
    }

    public boolean checkExist(UUID DeityId){
        return deityRepo.existsById(DeityId);
    }

    public boolean checkExistByName(String name){
        return deityRepo.existsByName(name);
    }
}


