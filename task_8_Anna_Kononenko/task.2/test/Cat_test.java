package com.people_cat_test;

import com.practice.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ANN on 07.01.2017.
 */
public class Cat_test {

    public static final int CAT_AGE = 2;
    public static final String CAT_NAME = "Masik";
    public static final String CAT_PORODA = "poroda";


    @Test
    public void testCat() {
        Cat cat = new Cat(CAT_AGE, CAT_PORODA, CAT_NAME);

        assertEquals(cat.getAge(), CAT_AGE);
        assertEquals(cat.getName(), CAT_NAME);
        assertEquals(cat.getPoroda(), CAT_PORODA);

    }

}
