package com.example.story.repos;

import com.example.story.object.Crow;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CrowsRepo extends CrudRepository <Crow, Long > {
    List<Crow> findByName(String name);
    boolean existsById(UUID id);
    boolean existsByName(String name);
}
