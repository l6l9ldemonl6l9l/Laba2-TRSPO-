package com.example.story.repos;

import com.example.story.subject.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface FoodRepo extends CrudRepository <Food, Long > {
    List<Food> findByKindFood(String kindFood);
    boolean existsById(UUID id);
    boolean existsByKindFood(String kindFood);
}
