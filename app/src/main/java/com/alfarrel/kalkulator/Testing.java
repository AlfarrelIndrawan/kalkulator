package com.alfarrel.kalkulator;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
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
    int kurang(int nilai) {
        return total -= nilai;
    }
    int multiply(int nilai) {
        return total *= nilai;
    }
    int divide(int nilai) {
        if (nilai == 0) return 0;
        else return total/nilai;
    }
    int cancel() {
        return 0;
    }

}