package com.example.javabasic.learn;

public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 11;
//        String ucapan;
//        if (nilai >= 75){
//            System.out.println("Keren");
//        } else {
//            ucapan = "kwkwkwkwk";
//        }
        String ucapan = nilai >= 75 ? "Selamat" : "huuuu";
        System.out.println(ucapan);
    }
}
