package com.alfarrel.kalkulator;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();
        String perintah = "";
        int nilai = 0;
        while (!perintah.equals("exit")) {
            perintah = in.next();
            switch (perintah) {
                case "add":
                    nilai = in.nextInt();
                    kal.total =  kal.add(nilai);
                    System.out.println(kal.total);
                    break;
                case "substract":
                    nilai = in.nextInt();
                    kal.total = kal.substract(nilai);
                    System.out.println(kal.total);
                    break;
                case "multiply":
                    nilai = in.nextInt();
                    kal.total = kal.multiply(nilai);
                    System.out.println(kal.total);
                    break;
                case "divide":
                    nilai = in.nextInt();
                    kal.total = kal.divide(nilai);
                    System.out.println(kal.total);
                    break;
                case "cancel":
                    kal.total = kal.cancel();
                    System.out.println(kal.total);
                    break;
                case "exit":
                    System.out.println(kal.exit());
                    break;
                default:
                    System.out.println(kal.total);
            }
        }

    }

}
class Kalkulator {
    int total;
    Kalkulator() {
        this.total = 0;
    }
    @Override
    public String toString() {
        return String.format("%d", total);
    }
    int add(int nilai) {
       return total += nilai;
    }
    int substract(int nilai) {
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
    String exit() {
        return ""+total;
    }
}