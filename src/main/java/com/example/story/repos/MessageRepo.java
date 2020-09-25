package com.example.story.repos;

import org.springframework.data.repository.CrudRepository;
import com.example.story.object.Message;
import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}