package com.furkangunes;

enum ETicaret{
    SMALL, MEDIUM, LARGE, XLARGE
}
public class _12_Enum {
    public static void main(String[] args) {
        ETicaret etc = ETicaret.LARGE;
        System.out.println(etc);

        System.out.println(etc.hashCode());
        System.out.println(etc.ordinal());

        // String'e çevir
        String etic = ETicaret.XLARGE.toString();
        System.out.println(etic.toUpperCase());
    }
}
