/*package com.myfairy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class Test {
  public static void main(String[] args) {
    Date date1= new Date();
    Crow crow1 = new Crow("Евгения", date1,33, 30);
    Crow crow2 = new Crow("Анастасия", date1,40, 35);

    Date date2= new Date();
    Fox fox1 = new Fox("Ирина", date2,30, 25);
    Fox fox2 = new Fox("Лена",  date2, 40, 75);

    Terrain terrain = new Terrain("Лес", 50);

    Food food1 = new Food(40,"Сыр");
    Food food2 = new Food(50,"Сырник");
    Food food3 = new Food(60,"Плавленый сыр");

    Date Birthday= new Date(1212121212121L);
    Deity deity = new Deity("Крылов", Birthday);

    AnimalLife story1 =new AnimalLife (fox1,crow1,terrain);
    AnimalLife story2 =new AnimalLife (fox2,crow2,terrain);

    DeityLife fairyStory = new DeityLife(deity);

    fairyStory.addFood(food1);
    fairyStory.addFood(food2);
    fairyStory.addFood(food3);

    fairyStory.addAnimalLife(story1);
    fairyStory.addAnimalLife(story2);

    fairyStory.showInformation();

    Scanner in = new Scanner(System.in);
    System.out.println("Какую еду дать какой паре животных?(введите 2 числа)\n");
    int choose1 = in.nextInt();
    int choose2 = in.nextInt();

    fairyStory.startStory(choose1,choose2);
    fairyStory.showInformation();

    System.out.println("Какой паре животных вы желаете повысить опыт но понизить энергию?(введите 1 число)\n");
    choose1 = in.nextInt();
    in.close();

    fairyStory.train(choose1);
    fairyStory.showInformation();
  }
}
*/