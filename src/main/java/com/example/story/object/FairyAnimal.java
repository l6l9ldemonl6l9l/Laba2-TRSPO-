package com.example.story.object;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class FairyAnimal{
  @Id
  final private UUID id;
  @Column(unique=true)
  final private String name;
  private Date lastLunchTime;
  private int energy;

  public FairyAnimal(String name, Date lastLunchTime,int energy) {
    this.name = name;
    this.lastLunchTime = lastLunchTime;
    this.energy = energy;
    this.id=UUID.randomUUID();
  }

  public String getName(){
    return name;
  }

  public void fatigue(){
    if (energy>5){
      this.energy-=5;
    }
  }

  public void eat() {
    this.lastLunchTime = new Date();
    this.energy+=20;
  }

  public void hunting() {
    if (energy>10){
      this.energy-=10;
    }
  }

  public void showInformation(){
    System.out.print(name+". Животное ело последний раз: "+ lastLunchTime+". Текущая енергия: "+ energy +".");
  }
}
