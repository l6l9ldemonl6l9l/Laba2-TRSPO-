package com.myfairy.object;
import java.util.Date;

final public class Crow extends FairyAnimal {
  private int sizeMind;

  public Crow(String name, Date lastLunchTime, int energy,int sizeMind) {
    super(name,lastLunchTime,energy);
    this.sizeMind = sizeMind;
  }

  public int getSizeMind() {
    return sizeMind;
  }

  public void training() {
    fatigue();
    sizeMind+=2;
  }

  public void voiceVin() {
    System.out.println("Ворнона:...");
  }

  public void voiceFail() {
    System.out.println("Ворона:Kaaaaaaaaaap");
  }

  public void showInformationAboutCrow(){
    System.out.print("Ворнона ");
    showInformation();
    System.out.println(" Текущий ум: "+ sizeMind +".");
  }
}
