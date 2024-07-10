package com.furkangunes.odev;

import java.util.Scanner;

public class ToFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fahrenheit'a çevirmek istediğiniz dereceyi giriniz: ");
        double derece = scan.nextDouble();

        double fahrenheit = ((double) 9 / 5 * derece) + 32;

        System.out.println("İşlem tamamlandı!\n" + derece + "°C ----> " + fahrenheit + "°F");
    }
}
