package test.annetik;


import java.util.StringJoiner;


public class StringTasks {

    //first task
    public static String replaceEmail(String email){

      String result = email.replace("@", "[ at ]");
      result = result.replace(".", "[ dot ]");

      return result;
    }

    //second task
    String sentence = "internationalization localization cat elephant monitor";


  public String shortenWords(String sentence) {
    String[] array = sentence.trim().split(" ");
    StringJoiner stringJoiner = new StringJoiner(" ");
    for (int i = 0; i < array.length; i++) {
      String word = array[i];
      String first = String.valueOf(word.charAt(0));
      String last = String.valueOf(word.charAt(word.length() - 1));
      int mid = word.length() - 2;
      if (word.length() <= 4) {
        stringJoiner.add(word);
      } else {
        String one = first + mid + last;
        stringJoiner.add(one);
      }
    }
    return stringJoiner.toString();
  }



  //third task

  public int  countPalindromes(String str2){
    String[] srt1 = str2.split(", ");

    int count = 0;
    for (int i = 0; i < srt1.length; i++) {
      StringBuilder stringBuilder = new StringBuilder(srt1[i]);
      if (srt1[i].equals(stringBuilder.reverse().toString())) {
        count++;
      }
    }
    return count;
  }

  //forth task

  String binary = "1100";

  public static int binaryToDecimal(String binary) {
    int result = 0;
    int point = binary.length() - 1;
    char[] array = binary.toCharArray();

    for (int i = 0; i <= array.length-1; i++) {
      if (array[point] == '1') {
        result += Math.pow(2, i);
      }
      point--;
    }

    return result;
  }

}















