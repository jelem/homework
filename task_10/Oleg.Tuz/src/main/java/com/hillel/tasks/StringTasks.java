package com.hillel.tasks;

public class StringTasks {
  public String replaceEmail(String email) {

    email = email.replace("@", "[ at ]");
    email = email.replace(".", "[ dot ");

    return email;

  }

  public String shortenWords(String sentence) {


    //sentence = sentence
    return "";
  }

  public int countPalindromes(String words) {
    return 0;
  }

  public int binaryToDecimal(String number) {
    return 0;
  }

  public static void main(String[] args) {
    StringTasks tasks = new StringTasks();

    String someEmail = "person@gmail.com";
    String result = tasks.replaceEmail(someEmail);

    System.out.println(result);
  }
}
