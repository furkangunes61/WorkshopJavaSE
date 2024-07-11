package com.furkangunes.odev;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("---HESAP MAKİNESİ UYGULAMASINA HOŞ GELDİNİZ---");

        System.out.println("İşlemler" + "\n[1]-Toplama" + "\n[2]-Çıkarma" + "\n[3]-Çarpma" + "\n[4]-Bölme");

        System.out.print("İşlem seçiniz: ");
        int islem = scan.nextInt();

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        int sonuc = 0;

        switch (islem){
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                if (sayi2 == 0) {
                    System.out.println("HATA! - Payda(ikinci sayı) 0 olamaz!");
                } else {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                }
                break;
        }
    }
}
