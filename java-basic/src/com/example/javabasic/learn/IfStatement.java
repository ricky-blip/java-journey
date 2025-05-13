package com.example.javabasic.learn;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 70;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda Pintar & Lulus");
        } else if (nilai == 70 && absen == 70) {
            System.out.println("Coba Lagi");
        } else {
            System.out.println("Selamat Anda Goblok & Mengulang");
        }
    }
}
