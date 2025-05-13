package com.example.javabasic.learn;

public class LoopingForEach {
    public static void main(String[] args) {
        String[] array = {"1A","2A","4A"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------------");
        for (var variable: array){
            System.out.println(variable);
        }
    }
}
