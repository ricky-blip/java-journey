package com.example.javabasic.learn;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 80;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        System.out.println(lulus);
    }
}
