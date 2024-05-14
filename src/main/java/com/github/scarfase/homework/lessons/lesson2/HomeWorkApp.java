package com.github.scarfase.homework.lessons.lesson2;

public class HomeWorkApp {
  public static void main(String[] args) {
    //    1.	Написать метод, принимающий на вход два целых числа и проверяющий,
    //    что их сумма лежит в пределах от 10 до 20 (включительно),
    //    если да – вернуть true, в противном случае – false.
    System.out.println(returnResultToNum(5,5));
    System.out.println(returnResultToNum(15,5));
    System.out.println(returnResultToNum(15,15));

  //    2.	Написать метод, которому в качестве параметра передается целое число,
  //    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
  //    Замечание: ноль считаем положительным числом.
    System.out.println("Give positive number: " + checkPositiveNumber(5));
    System.out.println("Give negative number: " + checkPositiveNumber(-5));
    System.out.println("Give zero number: " + checkPositiveNumber(0));
  //    3.	Написать метод, которому в качестве параметра передается целое число.
  //    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    System.out.println("Give negative number: " + checkNumber(-4));
    System.out.println("Give positive number: " + checkNumber(34));
    System.out.println("Give zero number: " + checkNumber(0));
  //    4.	Написать метод, которому  отпечатать в консоль указанную строку, указанное количество раз;
    printLineManyTimes(8, "Some text to print");
  //    5.	* Написать метод, который определяет, является ли год високосным,
  //    и возвращает boolean (високосный - true, не високосный - false).
  //    Каждый 4-й год являв качестве аргументов передается строка и число,
  //    метод долженется високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    System.out.println("Give 400 year: " + checkYear(400));
    System.out.println("Give 100 year: " + checkYear(100));
    System.out.println("Give 120 year: " + checkYear(120));
    System.out.println("Give 111 year: " + checkYear(111));
  }

  public static boolean returnResultToNum(int a, int b) {
    int sum = a + b;
    if (sum >= 10 && sum <= 20) {
      return true;
    } else {
      return  false;
    }
  }

  public static String checkPositiveNumber(int a) {
    if (a >= 0) {
      return "Number is positive";
    } else {
      return "Number is negative";
    }
  }

  public static boolean checkNumber(int a) {
    if (a < 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void printLineManyTimes(int counter, String s) {
    for (int i = 1; i <= counter; i++) {
      System.out.println(i + " : " + s);
    }
  }

  public static boolean checkYear(int year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 100 == 0) {
      return false;
    } else if (year % 4 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
