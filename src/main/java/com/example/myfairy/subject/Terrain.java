package com.example.myfairy.subject;
final public class Terrain{
  final private String name;
  final private int sizeBeauty;

  public Terrain(String name, int sizeBeauty) {
    this.name = name;
    this.sizeBeauty = sizeBeauty;
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
