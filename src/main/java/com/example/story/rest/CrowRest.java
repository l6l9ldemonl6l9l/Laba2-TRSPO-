package com.example.story.rest;

import com.example.story.object.Crow;
import com.example.story.controllers.CrowController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrowRest {
    private final CrowController crowController;

    public CrowRest(CrowController crowController) {
        this.crowController = crowController;
    }

    @PostMapping("/crows")
    public ResponseEntity<String> newClient(@RequestParam String name) {
        try{
            crowController.createCrow(name);
        }
        catch (IllegalArgumentException e){
            return new ResponseEntity<>("Bad Request: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Exception e ){
            return new ResponseEntity<>("Server Error: " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @GetMapping(value = "/crows",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCrow(@RequestParam String name) {
        Crow foundCrow;
        try {
            foundCrow = crowController.getCrowByName(name);
        }
        catch (IllegalArgumentException e){
            return new ResponseEntity<>("Bad Request: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Exception e ){
            return new ResponseEntity<>("Server Error: " + e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(foundCrow, HttpStatus.OK);
    }
}
