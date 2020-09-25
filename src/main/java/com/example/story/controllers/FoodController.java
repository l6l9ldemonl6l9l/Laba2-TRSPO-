package com.example.story.controllers;

import com.example.story.subject.Food;
import com.example.story.repos.FoodRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FoodController {
    private final FoodRepo foodRepo;

    public FoodController(FoodRepo foodRepo){
        this.foodRepo = foodRepo;
    }

    public void createFood(String kindFood) {
        if(checkExistByKindFood(kindFood))
            throw new IllegalArgumentException("This kindFood number already exists");
        int taste=10;
        Food Food= new Food(taste,kindFood);
        foodRepo.save(Food);

        System.out.println("\u001B[33m" + "New Food"+ Food.getKindFood() +" added" + "\u001B[0m");
    }

    public Food getFoodByKindFood(String kindFood) throws IllegalArgumentException {
        List<Food> foundFood = foodRepo.findByKindFood(kindFood);

        if(foundFood.size() == 0){
            throw new IllegalArgumentException("Food not found");
        }

        return foundFood.get(0);
    }

    public boolean checkExist(UUID FoodId){
        return foodRepo.existsById(FoodId);
    }

    public boolean checkExistByKindFood(String kindFood){
        return foodRepo.existsByKindFood(kindFood);
    }
}

