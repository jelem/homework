package com.hillel.task1;

public class Cash {

  private static final int number = 11;
  int[] cash = new int[number];
  int index = 2;

  public static void main(String[] args) {

    Cash cash = new Cash();
    System.out.println(cash.calculation(number));
    System.out.println(cash.calculation(10));

  }

  public int calculation(int num) {

    cash[0] = 1;
    cash[1] = 1;

    if (num < index) {
      return cash[num - 1];
    } else {
      for (int i = index; i < num; i++) {
        cash[i] = cash[i - 1] + cash[i - 2];
        index = index + 1;
      }

    }
    return cash[num - 1];
  }


}
