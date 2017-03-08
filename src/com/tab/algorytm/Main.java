package com.tab.algorytm;

public class Main {

    public static int wynik(int x) {

        if (x >= 0) {
            return x;
        }else {
            return (-x);
        }
    }

    public static void main(String[] args) {
        int x = -5;
        System.out.println("Wartosc bezwzgledna x wynosi: "+ wynik(x));
    }
}
