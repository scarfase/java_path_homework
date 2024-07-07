package com.github.scarfase.homework.lessons.lesson5;

public class HomeWorkApp {
  public static void main(String[] args) {
//    1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//    2.	Конструктор класса должен заполнять эти поля при создании объекта.
//    3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//    4.	Создать массив из 5 сотрудников.
//    Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//    ...
//    persArray[4] = new Person(...);
//    5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    Person[] personsArray = new Person[5];
    personsArray[0] = new Person("Kravtsov Denis", "Engineer", "d.kravtsov@mailbox.com", "87771234567", 30000, 30);
    personsArray[1] = new Person("Vetrov Alex", "Build", "a.vetrov@mailbox.com", "87051234567", 45000, 28);
    personsArray[2] = new Person("Sidorov Oleg", "Doctor", "o.sidorov@mailbox.com", "87021234567", 60000, 42);
    personsArray[3] = new Person("Holodov Egor", "Driver", "e.holodov@mailbox.com", "87001234567", 25000, 55);
    personsArray[4] = new Person("Laptev Dmiriy", "Cleaner", "d.laptev@mailbox.com", "87252123456", 20000, 44);
    for (int i = 0; i < personsArray.length; i++) {
      if (personsArray[i].getAge() > 40) {
        personsArray[i].getInfoAboutPerson();
      }
    }
  }
}
