package com.example.javabasic.learn;

public class Scope {
    public static void main(String[] args) {
        sayHello("Loooo");
    }

    static void sayHello(String name) {
        String hello = "Hello" + name;

        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello); //bisa diakses dikarenakan satu scope
        //System.out.println(hi); //tidak bisa diakses dikarenakan scope berbeda
    }
}
