package com.example.javabasic.learn;

public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
        loop(100);
    }
    //factorial menggunakan looping biasa
    //factorial adalah ketika memasukkan angka 5, maka 5x4x3x2x1
    static int factorial(int value){
        var result = 1;
        for (var counter = 1; counter <= value; counter++){
            result *= counter;
        }
        return result;
    }
    //factorial recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value -1);
        }
    }
    //looping recursive, membuat error stackoverflow
    static void loop(int value){
        if (value ==0) {
            System.out.println("selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value -1 );
        }
    }
}
