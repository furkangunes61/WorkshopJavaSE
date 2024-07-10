package com.furkangunes.odev;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("---RADAR UYGULAMASINA HOŞ GELDİNİZ---");

        System.out.print("Lütfen hızınızı giriniz: ");
        int hiz = scan.nextInt();
        int ceza = 0;

        if (hiz < 90){
            System.out.println("Radara yakalanmadınız.");
        }
        else if (hiz >= 90 && hiz <= 100) {
            ceza = ceza + 1000;
            System.out.println("Radara yakalandınız." + "\nCeza Tutarı: " + ceza + " TL");
        } else if (hiz >= 101 && hiz <= 110) {
            ceza = ceza + 2000;
            System.out.println("Radara yakalandınız." + "\nCeza Tutarı: " + ceza + " TL");
        } else if (hiz >= 111 && hiz <= 130) {
            ceza = ceza + 3000;
            System.out.println("Radara yakalandınız." + "\nCeza Tutarı: " + ceza + " TL");
        } else {
            ceza = ceza + 10000;
            System.out.println("Radara yakalandınız ve ehliyetinize el konuldu." + "\nCeza Tutarı: " + ceza + " TL");
        }
    }
}
