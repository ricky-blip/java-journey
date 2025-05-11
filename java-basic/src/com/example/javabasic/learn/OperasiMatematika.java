package com.example.javabasic.learn;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        //Operasi ke Variable Sendiri
        //a = a + 10; awalnya seperti ini
        a += 10; //lebih singkatnya
        System.out.println(a);
        //Unary Operator naik ++ adalah naik 1
        b++;
        int d = 20;
        d--;
        System.out.println(b);
        System.out.println(d);
        System.out.println(!true); //kebalikannya
    }
}
