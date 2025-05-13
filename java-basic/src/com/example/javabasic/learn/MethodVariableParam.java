package com.example.javabasic.learn;

public class MethodVariableParam {
    public static void main(String[] args) {
        int[] values = {80, 75, 80};
        sayCongrats("Ricky", values);
        System.out.println("-------------------------------");
        sayCongrats2("Yanto", 80,50);
    }
    //Tanpa Variabel Param
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        } else  {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
    //Dengan Variabel Param
    static void sayCongrats2(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + " Anda Lulus");
        } else  {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
