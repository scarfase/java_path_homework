package com.github.scarfase.homework.lessons.lesson6.zoo;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }
  @Override
  public void run(int runLength) {
    int maxLength = 200;
    if (runLength > maxLength){
      System.out.printf("%s can't run more then %dm\n", name, maxLength);
    } else {
      super.run(runLength);
    }
  }

  @Override
  public void swim(int swimLength) {
    System.out.println("cats can't swim");
  }
}
