package com.hillel.tasks;

public class StringTasks {

  public String replaceEmail(String email) {
    String newEmail = email.replace("@", "[ at ]");
    newEmail = newEmail.replace(".", "[ dot ]");
    return newEmail;
  }

  public String shortenWords(String sentence) {
    int counter = 0;
    String newSentence = "";
    String[] arrayOfWords = sentence.split(" ");
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < arrayOfWords.length; i++) {
      stringBuffer.append(operationForShorten(arrayOfWords[i]));
      stringBuffer.append(" ");
    }
    newSentence = stringBuffer.toString();
    newSentence = newSentence.trim();
    return newSentence;
  }

  private String operationForShorten(String elementOfArray) {
    String[] arrayOfLetter = elementOfArray.split("");
    String word = "";
    if (arrayOfLetter.length < 4) {
      word = elementOfArray;
    } else {
      word =
          arrayOfLetter[0] + (arrayOfLetter.length - 2) + arrayOfLetter[arrayOfLetter.length - 1];
    }
    return word;
  }

  public int countPalindromes(String words) {
    String[] arrayOfWords = words.split(",");
    String secondWord = "";
    int counter = 0;

    for (int i = 0; i < arrayOfWords.length; i++) {
      arrayOfWords[i] = arrayOfWords[i].trim();
      StringBuilder stringBuilder = new StringBuilder(arrayOfWords[i]);
      secondWord = stringBuilder.reverse().toString();
      System.out.println(secondWord);
      if (arrayOfWords[i].equals(secondWord)) {
        counter++;
      }
    }
    return counter;
  }

  public int binaryToDecimal(String number) {
    int newNumber = 0;
    int counter = 0;
    for (int i = number.length() - 1; i >= 0; i--) {
      if (Character.getNumericValue(number.charAt(i)) == 1) {
        newNumber = newNumber + (int) Math.pow(2, counter);
      }
      counter++;
    }
    return newNumber;
  }


}
