package com.furkangunes.odev;

import java.util.Scanner;

public class UniOrtalamaHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen vize notunuzu giriniz: ");
        double vizenotu = scan.nextInt();

        System.out.print("Lütfen final notunuzu giriniz: ");
        double finalnotu = scan.nextInt();

        double ortalama = (vizenotu * 40 / 100) + (finalnotu * 60 / 100);

        System.out.println("Ortalama hesaplandı!" + "\nOrtalamanız: " + ortalama);
    }
}
