package com.github.scarfase.homework.lessons.lesson6.zoo;

public class Animal {
  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public void run(int runLength) {
    System.out.printf("%s runned: %d meters\n", name, runLength);
  }

  public void swim(int swimLength) {
    System.out.printf("%s swimmed: %d meters\n", name, swimLength);
  }
}
