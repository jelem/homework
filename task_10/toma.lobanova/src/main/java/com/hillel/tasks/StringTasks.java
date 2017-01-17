package com.hillel.tasks;

public class StringTasks {

  public String replaceEmail(String email) {
    if (email == null) {
      return null;
    }
    email = email.replace("@", "[ at ]");
    email = email.replaceAll("\\.", "[ dot ]");
    return email;
  }

  public String shortenWords(String sentence) {
    if (sentence == null) {
      return null;
    }
    sentence = sentence.trim();
    String[] words = sentence.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = checkChangeWord(words[i]);
    }
    return String.join(" ", words);
  }

  private String checkChangeWord(String word) {
    int wordLength = word.length();
    word = word.toLowerCase();
    if (wordLength >= 4) {
      word = "" + word.charAt(0) + (wordLength - 2) + word.charAt(wordLength - 1);
    }
    return word;
  }

  public int countPalindromes(String words) {
    if (words == null || words.equals("")) {
      return 0;
    }
    int countPallindrom = 0;
    String[] wordsArray = words.split(",");
    for (int i = 0; i < wordsArray.length; i++) {
      if (checkWord(wordsArray[i])) {
        countPallindrom++;
      }
    }
    return countPallindrom;
  }

  private boolean checkWord(String word) {
    word = word.toLowerCase();
    word = word.trim();
    StringBuilder builder = new StringBuilder();
    builder.append(word);
    return word.equals(builder.reverse().toString());
  }

  public int binaryToDecimal(String number) {
    if (number == null || number.equals("")) {
      return 0;
    }
    int binary = 0;
    int length = number.length();
    for (int i = 0; i < length; i++) {
      binary += Character.getNumericValue(number.charAt(i)) * Math.pow(10, length - i - 1);
    }
    int decimal = 0;
    int pow = 0;
    do {
      decimal += binary % 10 * Math.pow(2, pow);
      pow++;
      binary /= 10;
    }
    while (binary != 0);
    return decimal;
  }
}
