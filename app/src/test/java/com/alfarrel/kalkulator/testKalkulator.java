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
}
