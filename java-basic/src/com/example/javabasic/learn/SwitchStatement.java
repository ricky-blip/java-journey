package com.example.javabasic.learn;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "C";
        switch (nilai) {
            case "A":
                System.out.println("Anda mendapatkan A");
                break;
            case "B":
                System.out.println("Anda mendapatkan B");
                break;
            case "C":
            case "D":
                System.out.println("Anda mendapatkan C atau D");
                break;
            default:
                System.out.println("Ini Default");
        }
        System.out.println("-----------------------------------------");
        var nilaiLamda = "D";

        switch (nilaiLamda) {
            case "A" -> System.out.println("Dapat A");
            case "B" -> System.out.println("Dapat B");
            case "C", "D" -> System.out.println("Dapat C atau D");
            default -> System.out.println("Tidak Dapat Nilai");
        }
        System.out.println("-----------------------------------------");
        var nilaiYield = "D";
        String ucapan = switch (nilaiYield) {
            case "A" : yield  "Ucapan A";
            case "B" : yield  "Ucapan B";
            case "C", "D" : yield  "Ucapan C atau D";
            default : yield  "Ucapan Default";
        };
        System.out.println(ucapan);
    }
}
