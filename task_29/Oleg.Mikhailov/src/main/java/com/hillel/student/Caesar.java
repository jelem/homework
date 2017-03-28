package com.hillel.student;

import java.util.StringJoiner;
import java.util.regex.Matcher;

public class Caesar {

  private int bias = 0;

  public String nameEncryption(String name) {
    if (name == null) {
      throw new NullPointerException("String name is empty");
    }
    StringJoiner stringJoiner = new StringJoiner("");
    bias = name.length();
    char[] nameChar = name.toCharArray();
    int dif = 0;
    for (int i = 0; i < nameChar.length; i++) {
      if (nameChar[i] + bias > 122 && Character.isLowerCase(nameChar[i])) {
        dif = (nameChar[i] + bias) - 123;
        stringJoiner.add("" + (char) (97 + dif));
        continue;
      }

      if (nameChar[i] + bias > 90 && Character.isUpperCase(nameChar[i])) {
        dif = (nameChar[i] + bias) - 91;
        stringJoiner.add("" + (char) (65 + dif));
        continue;
      }
      stringJoiner.add("" + (char) (nameChar[i] + bias));

    }

    return stringJoiner.toString();
  }


  public int ageEncryption(int age) {
    return age * 123;
  }

  public String nameDecryption(String name) {
    if (name == null) {
      throw new NullPointerException("String name is empty");
    }
    StringJoiner stringJoiner = new StringJoiner("");
    bias = name.length();
    char[] nameChar = name.toCharArray();
    int dif = 0;
    for (int i = 0; i < nameChar.length; i++) {
      if (nameChar[i] - bias < 97 && Character.isLowerCase(nameChar[i])) {
        dif = 97 - (nameChar[i] - bias);
        stringJoiner.add("" + (char) (123 - dif));
        continue;
      }

      if (nameChar[i] - bias < 65 && Character.isUpperCase(nameChar[i])) {
        dif = 65 - (nameChar[i] - bias);
        nameChar[i] = (char) (91 - dif);
        continue;
      }
      stringJoiner.add("" + (char) (nameChar[i] - bias));

    }
    return stringJoiner.toString();
  }

  public int ageDecryption(int age) {
    return age / 123;
  }

}
