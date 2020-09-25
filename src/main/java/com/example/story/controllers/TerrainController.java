/*package com.example.story.controllers;

import com.example.story.subject.Terrain;
import com.example.story.repos.TerrainRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TerrainController {
    private final TerrainRepo terrainRepo;

    public TerrainController(TerrainRepo terrainRepo){
        this.terrainRepo = terrainRepo;
    }

    public void createTerrain(String name) {
        if(checkExistByName(name))
            throw new IllegalArgumentException("This name number already exists");
        int sizeBeauty=10;
        Terrain Terrain= new Terrain(name, sizeBeauty);
        terrainRepo.save(Terrain);

        System.out.println("\u001B[33m" + "New Terrain"+ Terrain.getName() +" added" + "\u001B[0m");
    }

    public Terrain getTerrainByName(String name) throws IllegalArgumentException {
        List<Terrain> foundTerrain = terrainRepo.findByName(name);

        if(foundTerrain.size() == 0){
            throw new IllegalArgumentException("Terrain not found");
        }

        return foundTerrain.get(0);
    }

    public boolean checkExist(UUID TerrainId){
        return terrainRepo.existsById(TerrainId);
    }

    public boolean checkExistByName(String name){
        return terrainRepo.existsByName(name);
    }
}
*/

