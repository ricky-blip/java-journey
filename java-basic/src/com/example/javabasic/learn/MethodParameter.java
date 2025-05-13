package com.example.javabasic.learn;

public class MethodParameter {
    public static void main(String[] args) {
        methodParam("sudah diisi ", "ini param2nya ", 9);
    }

    static void methodParam(String isilah, String param2, int dataangka) {
        System.out.println("Data" + isilah + param2 + dataangka);
    }
}
