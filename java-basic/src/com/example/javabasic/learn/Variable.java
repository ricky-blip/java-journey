package com.example.javabasic.learn;

public class Variable {
    public static void main(String[] args) {
        //bisa belum diberi nilai
        String name;
        name = "Ricky Rinaldy";
        int age = 28;
        String address = "Indonesia";
        String nullAja = null;
        //var -> kata kunci untuk dinamis tipe datanya & harus langsung diberi nilai
        var firstName = "Ricky";
        var lastName = "Rinaldy";
        var umurSekarang = 100;
        //final -> kata kunci untuk tipe datanya tidak boleh diubah
        final String namaFinal = "Final";
        //namaFinal = "ganti";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(nullAja);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(umurSekarang);
        System.out.println(namaFinal);
    }
}
