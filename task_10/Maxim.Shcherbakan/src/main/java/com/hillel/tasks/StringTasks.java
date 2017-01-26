package com.hillel.tasks;

import java.util.StringJoiner;

public class StringTasks {

  public static void main(String[] args) {
    StringTasks stringTasks = new StringTasks();
    int result = stringTasks.binaryToDecimal("1100");
    System.out.println(result);
  }

  public String replaceEmail(String email) {
    return email.replace("@", "[ at ]").replace(".", "[ dot ]");
  }

  public String shortenWords(String sentence) {
    String[] array = sentence.trim().split(" ");
    StringJoiner words = new StringJoiner(" ");
    for (String str : array) {
      if (str.length() < 4) {
        words.add(str);
        continue;
      }
      words.add(
          String.valueOf(str.charAt(0))
              + String.valueOf(str.length() - 2)
              + String.valueOf(str.charAt(str.length() - 1))
      );
    }
    return words.toString();
  }

  public int countPalindromes(String words) {
    int counter = 0;
    String[] array = words.split(", ");
    for (String str : array) {
      StringBuilder check = new StringBuilder(str);
      if (str.equals(check.reverse().toString())) {
        counter++;
      }
    }
    return counter;
  }

  public int binaryToDecimal(String number) {
    int result = 0;
    int power = number.length();
    for (int i = 0; i < number.length(); i++) {
      result += Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(2, (power - 1));
      power--;
    }
    return result;
  }
}
