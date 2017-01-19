package com.hillel.tasks;

import java.util.StringJoiner;

public class StringTasks {

  public String replaceEmail(String email) {
    String result = email.replace("@", "[ at ]");

    result = result.replace(".", "[ dot ]");

    return result;
  }

  public String shortenWords(String sentence) {

    String[] arrayString = sentence.trim().split(" ");
    StringJoiner result = new StringJoiner(" ");

    for (int i = 0; i < arrayString.length; i++) {
      if (arrayString[i].length() < 4) {
        result.add(arrayString[i]);
        continue;
      }

      int countSymbols = arrayString[i].length() - 2;
      int size = countSymbols + 1;
      result.add(arrayString[i].charAt(0) + "" + countSymbols + "" + arrayString[i].charAt(size));
    }

    return result.toString();
  }

  public int countPalindromes(String words) {
    int count = 0;
    String[] tmp = words.split(", ");

    for (int i = 0; i < tmp.length; i++) {

      if (tmp[i].equals(new StringBuilder(tmp[i]).reverse().toString())) {
        count++;
      }
    }
    return count;
  }

  public int binaryToDecimal(String number) {

    int result = 0;
    char[] charNum = number.toCharArray();
    int point = charNum.length - 1;

    for (int i = 0; i <= charNum.length - 1; i++) {
      if (charNum[point] == '1') {
        result += Math.pow(2, i);
      }
      point--;
    }

    return result;
  }
}