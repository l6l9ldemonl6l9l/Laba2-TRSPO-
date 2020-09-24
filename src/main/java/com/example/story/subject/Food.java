package com.example.story.subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
final public class Food{
  private final int taste;
  private final String kindFood;
  private final Date birthday;
  @Id
  private final UUID id;

  public Food(int taste, String kindFood) {
    this.birthday = new Date();
    this.taste = taste;
    this.kindFood = kindFood;
    this.id =UUID.randomUUID();
  }

  public UUID getId() {
    return id;
  }

  public int getTaste() {
    return taste;
  }

  public void showInformationAboutFood(){
    System.out.println("Еда : "+ kindFood + ". Дата создания: "+ birthday+". Вкус: "+ taste +".\n");
  }
}
