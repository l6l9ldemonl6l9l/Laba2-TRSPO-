package com.example.story.repos;

import com.example.story.object.Fox;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface FoxsRepo extends CrudRepository <Fox, Long > {
    List<Fox> findByName(String name);
    boolean existsById(UUID id);
    boolean existsByName(String name);
}
