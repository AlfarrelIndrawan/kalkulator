package com.alfarrel.kalkulator;

import org.junit.Assert;
import org.junit.Test;

public class testKalkulator {
    @Test
    public void testToString() {
        Kalkulator kal = new Kalkulator();
        String test = "10";
        kal.total = 10;
        Assert.assertEquals(test, kal.toString());
    }
    @Test
    public void testTambah() {
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        Assert.assertEquals(15,kal.tambah(5));
    }
    @Test
    public void testKurang() {
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        Assert.assertEquals(5, kal.kurang(5));
    }
    @Test
    public void testMultiply() {
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        Assert.assertEquals(20, kal.multiply(2));
    }
    @Test
    public void testDivisionGivenNumberNotZero() {
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        Assert.assertEquals(5,kal.divide(2));
    }
    @Test
    public void testDivisionGivenNumberZero() {
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        Assert.assertEquals(0,kal.divide(0));
    }
    @Test
    public void testCancel() {
        Kalkulator kal = new Kalkulator();
        kal.total = 0;
        Assert.assertEquals(0,kal.cancel());
    }
}
