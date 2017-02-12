package com.hillel.task2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShowerTest {
    Shower shower;

    @Before

    public void setUp() {
        shower = new Shower();
    }

    @Test
    public void batheTest0() {
        shower.setColdWater(false);
        shower.setHotWater(false);
        shower.bathe();
        assertThat(shower.bathe(), is("You can not bathe"));
    }

    @Test
    public void batheTest1() {
        shower.setColdWater(true);
        shower.setHotWater(false);
        shower.bathe();
        assertThat(shower.bathe(), is("You can catch a cold"));
    }

    @Test
    public void batheTest2() {
        shower.setColdWater(false);
        shower.setHotWater(true);
        shower.bathe();
        assertThat(shower.bathe(), is("You can burn"));
    }

    @Test
    public void batheTest3() {
        shower.setColdWater(true);
        shower.setHotWater(true);
        shower.bathe();
        assertThat(shower.bathe(), is("You can bathe"));
    }
}
