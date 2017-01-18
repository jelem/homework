package com.hillel.tasks;

public class Fibonacci {
  //сложность итеративного алгоритма решения O(n) - линейная
  public int iterative(int element) {
    int numberPrev = 1;
    int numberPres = 1;
    int temp;
    for (int i = 3; i <= element; i++) {
      temp = numberPres;
      numberPres = numberPrev + numberPres;
      numberPrev = temp;
    }
    return numberPres;
  }

  //так как рекурсия двойная, то сложность будет O(2 ^ n) то есть экспоненциальная
  public int recursive(int element) {
    if (element == 1) {
      return 1;
    }
    if (element == 2) {
      return 1;
    }
    return recursive(element - 1) + recursive(element - 2);
  }
}
