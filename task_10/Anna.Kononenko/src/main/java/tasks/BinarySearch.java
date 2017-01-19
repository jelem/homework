package com.hillel.tasks;

/**
 5.Напишите функцию нахождения числа в массиве,
 элементы которого упорядочены по возрастанию.
 Если число есть в массиве функция должна возвращать true, иначе - false */

public class BinarySearch {

  public boolean exists(int[] array, int number) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        return true;
      }
    }
    return false;
  }
}

