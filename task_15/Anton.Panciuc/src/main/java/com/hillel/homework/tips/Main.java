package com.hillel.homework.tips;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Write bill total amount ");
    double summ = Double.parseDouble(reader.readLine());
    System.out.println("Service level ");
    String level = reader.readLine();


    Class clazz = Class.forName("com.hillel.homework.tips." + level);
    Tips tips = (Tips)clazz.newInstance();
    double result = tips.count(summ);
    System.out.println("You should pay " + result);
  }
}
