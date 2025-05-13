package com.example.javabasic.learn;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("2");
        sayHello("3", "33");
    }

    static void sayHello() {
        System.out.println("1");
    }

    static void sayHello(String angka2) {
        System.out.println(angka2);
    }

    static void sayHello(String angka3, String angka33) {
        System.out.println(angka3 + angka33);
    }
}
