package com.example.story.subject;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
final public class Terrain{
  @Id
  private final UUID id;
  final private String name;
  final private int sizeBeauty;

  public Terrain(String name, int sizeBeauty) {
    this.name = name;
    this.sizeBeauty = sizeBeauty;
    this.id=UUID.randomUUID();;
  }

  public int getSizeBeauty(){
    return sizeBeauty;
  }

  public void showInformationAboutTerrain(){
    System.out.print("Месность :"+name+". Красота:");

    if (sizeBeauty<20){
      System.out.println(" ниже среднего.");
    }

    if (sizeBeauty>=20 &sizeBeauty<=60){
      System.out.println(" красиво.");
    }

    if (sizeBeauty>60){
      System.out.println(" очень красиво.");
    }
  }

}
