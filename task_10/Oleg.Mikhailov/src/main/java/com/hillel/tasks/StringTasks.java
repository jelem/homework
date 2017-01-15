package com.hillel.tasks;

import java.util.Arrays;

public class StringTasks {

  public String replaceEmail(String email) {
    String result = email.replace("@", "[ at ]");

    result = result.replace(".", "[ dot ]");

    return result;
  }

  public String shortenWords(String sentence) {
    int countSymbols = 0;
    int size = 0;
    String[] arrayString = sentence.trim().split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < arrayString.length; i++) {
      if (arrayString[i].length() < 4) {
        result.append(arrayString[i] + " ");
        continue;
      }

      countSymbols = arrayString[i].length() - 2;
      size = countSymbols + 1;
      result.append(arrayString[i].charAt(0));
      result.append(countSymbols);
      result.append(arrayString[i].charAt(size) + " ");


    }

    return result.toString().trim();
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
	  
    double result = 0;
    char[] charNum = number.toCharArray();
    int point = charNum.length-1;

    for (int i = 0; i <= charNum.length-1; i++) {
      if(charNum[point] == '1') {
        result += Math.pow(2, i);
      }
      point--;
    }

    return (int)result;
  }
}