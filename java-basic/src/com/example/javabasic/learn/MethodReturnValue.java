package com.example.javabasic.learn;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
    }

    static int sum(int v1, int v2) {
        var total = v1 + v2;
        return total;
    }
}
