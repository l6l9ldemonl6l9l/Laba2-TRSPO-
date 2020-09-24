package com.example.story.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.story.object.Message;

public interface MessageRepo extends CrudRepository<Message, Integer> {

}