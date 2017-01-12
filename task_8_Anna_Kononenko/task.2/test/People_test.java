package com.people_cat_test;

import com.practice.People;
import com.practice.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ANN on 07.01.2017.
 */
public class People_test {


    private String name;
    private String lastName;
    private int age;

    public static final int CAT_AGE = 2;
    public static final String CAT_NAME = "Masik";
    public static final String CAT_PORODA = "poroda";


    public static final int AGE = 29;
    public static final String LASTNAME = "Конон";
    public static final String NAME = "Джон";


    @Test
    public void TestPeople() {
        Cat cat = new Cat(CAT_AGE, CAT_NAME, CAT_PORODA);

        People people = new People(NAME, LASTNAME, AGE, cat);

        assertEquals(people.getAge(), AGE);
        assertEquals(people.getName(), NAME);
        assertEquals(people.getLastName(), LASTNAME);
        assertNotNull(people.getCat());
        assertEquals(people.getCat(), cat);


    }

}
