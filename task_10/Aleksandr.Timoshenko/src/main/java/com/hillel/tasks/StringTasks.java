package com.hillel.tasks;

public class StringTasks {

  public String replaceEmail(String email) {
    String changedEmail = email.replace("@", "[ at ]");
    String changedEmail2 = changedEmail.replace(".", "[ dot ]");
    return changedEmail2;
  }

  public String shortenWords(String sentence) {
    String[] words = (sentence.trim()).split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= 4) {
        String word = words[i];
        int quantity = word.length();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(quantity - 1);
        String result = firstLetter + Integer.toString(quantity - 2) + lastLetter;
        words[i] = result;
      }


    }
    return String.join(" ", words);
  }

  public int countPalindromes(String words) {
    int polindromes = 0;
    String[] arrayWords = words.split(",");
    for (int i = 0; i < arrayWords.length; i++) {
      String word = arrayWords[i].trim();
      String reversWord = new StringBuilder(word).reverse().toString();
      if (word.equals(reversWord)) {
        polindromes++;
      }
    }
    return polindromes;
  }

  public int binaryToDecimal(String number) {
    int num = Integer.parseInt(number, 2);

    return num;
  }

}
