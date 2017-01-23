package com.hillel.tasks;


import java.util.StringJoiner;

public class StringTasks {

  public String replaceEmail(String email) {
    String result = email.replace("@", "[ at ]");

    result = result.replace(".", "[ dot ]");

    return result;
  }

  public String shortenWords(String sentence) {

    String[] array = sentence.trim().split(" ");
    StringJoiner result = new StringJoiner(" ");

    for (int i = 0; i < array.length; i++) {
      if (array[i].length() < 4) {
        result.add(array[i]);
        continue;
      }

      int countSymbols = array[i].length() - 2;
      int last = countSymbols + 1;
      result.add(array[i].charAt(0) + "" + countSymbols + "" + array[i].charAt(last));
    }

    return result.toString();
  }

  public int countPalindromes(String words) {
    int count = 0;
    String[] array = words.split(", ");

    for (int i = 0; i < array.length; i++) {

      if (array[i].equals(new StringBuilder(array[i]).reverse().toString())) {
        count++;
      }
    }
    return count;
  }

  public int binaryToDecimal(String number) {

    int result = 0;
    char[] chars = number.toCharArray();
    int index = chars.length - 1;

    for (int i = 0; i < chars.length; i++) {
      if (chars[index] == '1') {
        result += Math.pow(2, i);
      }
      index--;
    }

    return result;
  }
}
