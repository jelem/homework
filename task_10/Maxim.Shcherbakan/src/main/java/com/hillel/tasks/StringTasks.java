package com.hillel.tasks;

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
    for (int i = 0; i < array.length; i++) {
      if (array[i].length() < 4) {
        continue;
      }
      StringBuilder word = new StringBuilder();
      array[i] = word
          .append(array[i].charAt(0))
          .append(array[i].length() - 2)
          .append(array[i].charAt(array[i].length() - 1))
          .toString();
    }
    return String.join(" ", array);
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
