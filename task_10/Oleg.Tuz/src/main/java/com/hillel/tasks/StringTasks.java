package com.hillel.tasks;

import java.util.StringJoiner;

public class StringTasks {
  public String replaceEmail(String email) {

    email = email.replace("@", "[ at ]");
    email = email.replace(".", "[ dot ]");

    return email;

  }

  public String shortenWords(String sentence) {

    String[] array = sentence.trim().split(" ");
    StringJoiner stringJoiner = new StringJoiner(" ");

    for (int i = 0; i < array.length; i++) {
      String word = array[i];
      String first = String.valueOf(word.charAt(0));
      String last = String.valueOf(word.charAt(word.length() - 1));
      int mid = word.length() - 2;
      if (word.length() <= 4) {
        stringJoiner.add(word);
      } else {
        String one = first + mid + last;
        stringJoiner.add(one);
      }
    }
    return stringJoiner.toString();
  }


  public int countPalindromes(String words) {
    String[] array = words.trim().split(",");
    int count = 0;

    for (int i = 0; i < array.length; i++) {
      if (isPolindrome(array[i])) {
        count++;
      }
    }


    return count;
  }

  private boolean isPolindrome(String word) {
    word = word.trim();
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public int binaryToDecimal(String number) {

    int result = 0;
    int power = number.length() - 1;
    for (int i = 0; i < number.length(); i++) {
      char symbol = number.charAt(i);
      int digit = Character.getNumericValue(symbol);
      result = result + (int) Math.pow(2, power) * digit;
      power--;

    }

    return result;


  }

  public static void main(String[] args) {
    StringTasks tasks = new StringTasks();

    String someEmail = "person@gmail.com";
    String result = tasks.replaceEmail(someEmail);

    System.out.println(result);
  }
}

