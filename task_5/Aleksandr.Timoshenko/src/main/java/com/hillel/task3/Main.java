package com.hillel.task3;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    
		IntStream.iterate(90, e -> e-5).limit(90/5)
			.forEach(e -> System.out.print(e + ", "));
  }
}