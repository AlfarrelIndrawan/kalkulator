package com.alfarrel.kalkulator;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        kal.total = 10;
        System.out.println(kal.toString());
        String perintah = "";
        while (perintah.equals("TAMPILKAN")) {
            perintah = in.next();
        }

    }

}
class Kalkulator {
    int total;

    @Override
    public String toString() {
        return String.format("%d", total);
    }
    int tambah(int nilai) {
       return total += nilai;
    }
}