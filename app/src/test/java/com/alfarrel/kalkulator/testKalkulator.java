package com.alfarrel.kalkulator;

import org.junit.Test;

public class testKalkulator {
    @Test
    void testTampilkan() {
        Kalkulator kal = new Kalkulator();
        assertvalue("0.0",kal.tampilkan());
    }
}
