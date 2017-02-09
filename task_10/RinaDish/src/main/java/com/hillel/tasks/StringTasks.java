package com.hillel.tasks;

public class StringTasks {


  public String replaceEmail(String email) {
    String newEmail = email.replace("@", "[at]");
    newEmail = newEmail.replace(".", "[dot]");
    return newEmail;
  }

  public String shortenWords(String sentence) {
    String[] arrayOfWord = sentence.split(" ");
    String newSentence = "";
    StringBuffer stringBuffer = new StringBuffer();

    for (int i = 0; i < arrayOfWord.length; i++) {

      stringBuffer.append(operationForShorten(arrayOfWord[i]));
      stringBuffer.append(" ");
    }

    newSentence = stringBuffer.toString();
    newSentence = newSentence.trim();

    return newSentence;
  }

  public String operationForShorten(String arrayOfWord) {
    String[] arrayOfElement = arrayOfWord.split("");
    String word = "";
    if (arrayOfElement.length > 5) {
      word = arrayOfElement[0] + (arrayOfWord.length() - 2) + arrayOfElement[arrayOfElement.length
          - 1];
    } else {
      word = arrayOfWord;
    }

    return word;
  }

  public int countPalindromes(String words) {
    String[] array = words.split(", ");

    int quantity = 0;
    for (int i = 0; i < array.length; i++) {
      int count = 0;
      String[] arrayOfChar = array[i].split("");

      for (int j = 0; j < arrayOfChar.length; j++) {

        if (arrayOfChar[j].equals(arrayOfChar[arrayOfChar.length - 1 - j])) {

          count++;
        }

      }
      if (count == arrayOfChar.length) {
        quantity++;

      }
    }

    return quantity;
  }

  public int binaryToDecimal(String number) {
    int decimal = 0;
    String[] arrayOfNumber = number.split("");
    for (int i = 0; i < arrayOfNumber.length; i++) {
      int num = Integer.parseInt(arrayOfNumber[i]);
      if (num == 1) {
        decimal = decimal + (int) (Math.pow(2, arrayOfNumber.length - 1 - i));
      }
    }
    return decimal;
  }
}
