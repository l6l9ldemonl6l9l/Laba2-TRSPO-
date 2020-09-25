package com.example.story.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
final public class Deity{
  @Id
  private final UUID id;
  @Column(unique=true)
  private final String name;
  private final Date age;

  public Deity(String name, Date age) {
    this.name = name;
    this.age = age;
    this.id=UUID.randomUUID();
  }
  public String getName(){ return name; }

  public void showInformationAboutAuthor(){
    System.out.println("Автор:"+name+". Дата рождения:"+age+".\n");
  }

}
