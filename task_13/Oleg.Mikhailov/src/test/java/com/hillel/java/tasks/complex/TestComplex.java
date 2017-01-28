package com.hillel.java.tasks.complex;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestComplex {

  Complex complex;
  Complex sqrtNum;

  @Before
  public void setUp() {
    complex = new Complex(2, 1);
    sqrtNum = new Complex(-4, 0);
  }

  @Test
  public void testAdd() {
    Complex resultAdd = complex.add(new Complex(-1, 2));
    assertThat(true, is(resultAdd.equals(new Complex(1, 3))));
  }

  @Test
  public void testSub() {
    Complex resultSub = complex.sub(new Complex(-1, 2));
    assertThat(true, is(resultSub.equals(new Complex(3, -1))));
  }

  @Test
  public void testMux() {
    Complex resultMux = complex.mux(new Complex(-1, 2));
    assertThat(true, is(resultMux.equals(new Complex(-4, 3))));
  }

  @Test
  public void testDiv() {
    Complex resultDiv = complex.div(new Complex(-1, 2));
    assertThat(true, is(resultDiv.equals(new Complex(0, -1))));
  }

  @Test
  public void testSQRT() {
    Complex result = sqrtNum.sqrt(sqrtNum);
    assertThat(true, is(result.equals(new Complex(0, 2))));
  }

}
