package com.example.javabasic.mini_project;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        System.out.println("=== Mini Calculator ===");

        while (lanjut) {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = scanner.next().trim();  // ambil input operator sebagai String dan trim spasi

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil;

            if (operator.equals("+")) {
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
            } else if (operator.equals("-")) {
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
            } else if (operator.equals("*")) {
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
            } else if (operator.equals("/")) {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }
            } else {
                System.out.println("Operator tidak valid.");
            }

            System.out.print("Hitung lagi? (y/n): ");
            String ulang = scanner.next();
            lanjut = ulang.equalsIgnoreCase("y");
        }

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        scanner.close();
    }
}
