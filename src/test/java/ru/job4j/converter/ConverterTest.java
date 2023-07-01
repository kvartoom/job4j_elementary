package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert210RblThen3Euro() {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert190RblThen3dot1667Dollars() {
        float in = 190;
        float expected = 3.1667f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}