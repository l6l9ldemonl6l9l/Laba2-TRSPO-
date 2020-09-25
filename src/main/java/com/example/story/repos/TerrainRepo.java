package com.example.story.repos;

import com.example.story.subject.Terrain;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TerrainRepo extends CrudRepository <Terrain, Long > {
    List<Terrain> findByName(String name);
    boolean existsById(UUID id);
    boolean existsByName(String name);
}
