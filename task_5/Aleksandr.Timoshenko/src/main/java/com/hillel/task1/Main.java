package com.hillel.task1;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    
		IntStream.iterate(1000, e -> e+3).limit(3000)
			.forEach(e -> System.out.print(e + ", "));
  }
}