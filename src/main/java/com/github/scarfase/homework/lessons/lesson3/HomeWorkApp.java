package com.github.scarfase.homework.lessons.lesson3;

public class HomeWorkApp {
  public static void main(String[] args) {
    /*
      7.	** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
      Примеры:
      checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
      checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
      граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
      8.	*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    */
    int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    revertZerosAndOneses(arr1);
    fillArray();
    int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    multiplitacionBySix(arr2);
//    diagonalDualArr(9);
//    diagonalDualArr(4);
    fillArrayWithData(22, 13432);
    int[][] diagonalArr = diagonalDualArr(5, 1);
    System.out.println(diagonalArr);
    int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println(findMinElementInArray(arr3));
    System.out.println(findMaxElementInArray(arr3));
  }
  // 1.	Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
  public static void revertZerosAndOneses(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        arr[i] = 1;
      } else {
        arr[i] = 0;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.print("\n");
  }
  // 2.	Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
  public static void fillArray() {
    int[] arr = new int[100];
    for (int i = 1; i <= arr.length; i++) {
      arr[i-1] = i;
      System.out.print(arr[i-1] + " ");
    }
    System.out.println();
  }
  // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
  public static int[] multiplitacionBySix(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 6) {
        arr[i] *= 2;
      }
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    return arr;
  }
  // 4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
  // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,если обе сложно).
  // Определить элементы одной из диагоналей можно по следующему принципу:
  // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
  public static int[][] diagonalDualArr(int arrSize, int value) {
    int[][] arr = new int[arrSize][arrSize];
    for (int i = 0; i < arrSize; i++) {
      arr[i][i] = value;
      arr[i][arr.length - i - 1] = value;
    }
    return arr;
  }
  // 5.	Написать метод, принимающий на вход два аргумента: len и initialValue,
  // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
  public static int[] fillArrayWithData(int len, int initialValue) {
    if (len <= 0 ) {
      System.out.println("len must be more 0.");
      return null;
    }
    int[] arr = new int[len];
    System.out.println("Print arr with initial value: ");
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = initialValue;
      System.out.print(arr[i] + " ");
    }
    System.out.print("]");
    return arr;
  }
  //6.* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
  public static int findMinElementInArray(int... arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }
  public static int findMaxElementInArray(int... arr) {
    int max = arr[0];
    for (int i = arr.length - 1; i > 0; i--) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }
}
