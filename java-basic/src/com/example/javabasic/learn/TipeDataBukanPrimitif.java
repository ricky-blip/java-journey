package com.example.javabasic.learn;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        //Byte adalah TipeData Bukan Primitif, oleh karena itu bisa = null
        //Jika byte saja, tidak bisa null
        Byte iniByte;
        iniByte = 10;
        System.out.println(iniByte);

        iniByte = null;
        System.out.println(iniByte);

        //Konversi Primitif ke Bukan Primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
    }
}
