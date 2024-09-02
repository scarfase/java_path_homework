package com.github.scarfase.homework.lessons.lesson6;

import com.github.scarfase.homework.lessons.lesson6.zoo.Animal;
import com.github.scarfase.homework.lessons.lesson6.zoo.Cat;
import com.github.scarfase.homework.lessons.lesson6.zoo.Dog;

public class HomeWorkApp {
//  1.	Создать классы Собака и Кот с наследованием от класса Животное.
//  2.	Все животные могут бежать и плыть.
//      В качестве параметра каждому методу передается длина препятствия.
//      Результатом выполнения действия будет печать в консоль.
//      (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//  3.	У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//                                                        плавание: кот не умеет плавать, собака 10 м.).
//  4.	* Добавить подсчет созданных котов, собак и животных.
  public static void main(String[] args) {
    Dog dog1 = new Dog("Bobik");
    Cat cat1 = new Cat("Mursik");

    dog1.run(200);
    cat1.run(20);
    dog1.run(700);
    cat1.run(220);

    dog1.swim(3);
    dog1.swim(30);
    cat1.swim(5);

    Animal[] animals = {
            new Cat("Barsik"),
            new Dog("Bobik"),
            new Animal("Kesha"),
            new Cat("Barsik1"),
            new Dog("Bobik1"),
            new Animal("Kesha1"),
            new Cat("Barsik2"),
            new Dog("Bobik2"),
            new Animal("Kesha2")
    };

    int totalAnimalsInZoo = 0;
    int totalDogsInZoo = 0;
    int totalCatsInZoo = 0;
    for (int i = 0; i < animals.length; i++) {
      if (animals[i] instanceof Cat) {
        totalCatsInZoo ++;
      } else if (animals[i] instanceof Dog) {
        totalDogsInZoo ++;
      } else {
        totalAnimalsInZoo++;
      }
    }
    System.out.printf("Cats in zoo: %d\n" +
                      "Dogs in zoo: %d\n" +
                      "Animals in zoo %d\n", totalCatsInZoo, totalDogsInZoo, totalAnimalsInZoo);
  }
}
