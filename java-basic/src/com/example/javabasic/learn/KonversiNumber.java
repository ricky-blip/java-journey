package com.example.javabasic.learn;

public class KonversiNumber {
    public static void main(String[] args) {
        //Konversi Tipe Data Number
        //-Widening Casting (Otomatis): byte->short->int->long->float->double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        //-Narrowing Casting (Manual): double->float->long->int->short->byte
        int iniInt2 = 1000;
        byte inibyte2 = (byte) iniInt;
    }
}
