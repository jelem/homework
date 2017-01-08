package com.travis.test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import com.hillel.tasks.Calculator;

public class CalculatorTest {
	
	@Test
	public void additionTest() {
		int result = Calculator.addition(3, 5);
		assertThat(result, is(8));
	}
}