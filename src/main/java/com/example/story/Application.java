package com.example.story;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import com.example.story.object.Crow;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    Date date1= new Date();
    Crow crow1 = new Crow("Евгения", date1,33, 30);
    Crow crow2 = new Crow("Анастасия", date1,40, 35);

}
