package com.hillel.task4;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    
		IntStream.iterate(2, e -> e+e).limit(20)
			.forEach(e -> System.out.print(e + ", "));
  }
}