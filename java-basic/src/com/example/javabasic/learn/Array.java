package com.example.javabasic.learn;

public class Array {
    public static void main(String[] args) {
        //Cara 1
        String[] stringArray;
        stringArray = new String[2];
        stringArray[0] = "Ricky";
        stringArray[1] = "Rinaldy";
        System.out.println(stringArray[1]);
        //Cara 2
        String[] stringArray2 = new String[2];
        //Array Initializer
        int[] arrrayInt = new int[]{10,20,30};
        long[] arrayLong = {10L,20L,30L};
        System.out.println(arrayLong.length);
        //Array didalam Array
        Integer[][] count = {
                {1,10},
                {2,20},
                {3}
        };
        System.out.println(count[1][1]);
    }
}
