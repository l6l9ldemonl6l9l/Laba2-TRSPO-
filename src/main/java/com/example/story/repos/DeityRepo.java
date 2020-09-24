package com.example.story.repos;

import com.example.story.object.Deity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface DeityRepo extends CrudRepository <Deity, Long > {
    List<Deity> findByName(String name);
    boolean existsById(UUID id);
    boolean existsByName(String name);
}
