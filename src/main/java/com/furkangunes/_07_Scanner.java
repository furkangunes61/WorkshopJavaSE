package com.furkangunes;

import java.util.Scanner;

public class _07_Scanner {
    public static void main(String[] args) {
        // Kullanıcıda veri almak istersek
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name = scanner.nextLine();
        System.out.println("Adınız: " + name);
        scanner.close();
    }
}
