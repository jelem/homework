package ua.od.hillel.lipstick;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TestLipstick {
    Lipstick lipstick;

    @Before
    public void setUp() {
        lipstick = new Lipstick();
    }

    @Test
    public void TestGetSetPriceValid() {
        lipstick.setPrice(200);
        int result = lipstick.getPrice();
        assertThat(result, is(200));
    }

    @Test
    public void TestGetSetPriceInvalid() {
        lipstick.setPrice(-200);
        int result = lipstick.getPrice();
        assertThat(result, is(0));
    }

    @Test
    public void TestGetSetManufactValid() {
        lipstick.setManufacturer("M.A.C.");
        String result = lipstick.getManufacturer();
        assertThat(result, is("M.A.C."));
    }

    @Test
    public void TestGetSetManufactInvalid() {
        lipstick.setManufacturer(null);
        String result = lipstick.getManufacturer();
        assertThat(result, is("unspecified"));
    }

    @Test
    public void TestGetSetModeltValid() {
        lipstick.setModel("Basic care");
        String result = lipstick.getModel();
        assertThat(result, is("Basic care"));
    }

    @Test
    public void TestGetSetModelInvalid() {
        lipstick.setModel(null);
        String result = lipstick.getModel();
        assertThat(result, is("unspecified"));
    }

    @Test
    public void TestGetSetColor() {
        lipstick.setColor(Color.RED);
        Color result = lipstick.getColor();
        assertThat(result, is(Color.RED));
    }
}
