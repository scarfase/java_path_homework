package com.github.scarfase.homework.lessons.lesson6.zoo;

public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }
  @Override
  public void run(int runLength) {
    int maxLength = 500;
    if (runLength > maxLength){
      System.out.printf("%s can't run more then %dm\n", name, maxLength);
    } else {
      System.out.printf("%s runned: %d meters\n", name, runLength);
    }
  }

  @Override
  public void swim(int swimLength) {
    int maxSwimLength = 10;
    if (swimLength  > maxSwimLength) {
      System.out.printf("%s can't swim more when %dm\n", name, maxSwimLength);
    } else {
      super.swim(swimLength);
    }
  }
}
