package com.hillel.task2;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    
		IntStream.iterate(1, e -> e+2).limit(55)
			.forEach(e -> System.out.print(e + ", "));
  }
}