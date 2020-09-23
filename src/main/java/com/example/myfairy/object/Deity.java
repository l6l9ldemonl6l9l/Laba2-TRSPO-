package com.example.myfairy.object;
import java.util.Date;
import java.util.UUID;

final public class Deity{
  private final UUID id;
  private final String name;
  private final Date age;

  public Deity(String name, Date age) {
    this.name = name;
    this.age = age;
    this.id=UUID.randomUUID();
  }

  public void showInformationAboutAuthor(){
    System.out.println("Автор:"+name+". Дата рождения:"+age+".\n");
  }

}
