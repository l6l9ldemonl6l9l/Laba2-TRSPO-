package com.example.story.rest;

import com.example.story.controllers.FoodController;
import com.example.story.subject.Food;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodRest {
    private final FoodController FoodController;

    public FoodRest(FoodController FoodController) {
        this.FoodController = FoodController;
    }

    @PostMapping("/Foods")
    public ResponseEntity<String> newClient(@RequestParam String kindFood) {
        try{
            FoodController.createFood(kindFood);
        }
        catch (IllegalArgumentException e){
            return new ResponseEntity<>("Bad Request: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Exception e ){
            return new ResponseEntity<>("Server Error: " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @GetMapping(value = "/Foods",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getFood(@RequestParam String kindFood) {
        Food foundFood;
        try {
            foundFood = FoodController.getFoodByKindFood(kindFood);
        }
        catch (IllegalArgumentException e){
            return new ResponseEntity<>("Bad Request: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Exception e ){
            return new ResponseEntity<>("Server Error: " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(foundFood, HttpStatus.OK);
    }
}
