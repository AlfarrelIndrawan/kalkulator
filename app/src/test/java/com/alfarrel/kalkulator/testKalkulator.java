package com.alfarrel.kalkulator;

import org.junit.Assert;
import org.junit.Test;

public class testKalkulator {
    @Test
    void testToString() {
        Kalkulator kal = new Kalkulator();
        String test = "10";
        kal.total = 10;
        Assert.assertEquals(test, kal.toString());
    }
    @Test
    void testTambah() {
        Kalkulator kal = new Kalkulator();
    }
}
