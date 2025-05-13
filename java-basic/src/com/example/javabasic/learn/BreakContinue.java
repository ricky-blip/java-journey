package com.example.javabasic.learn;

public class BreakContinue {
    public static void main(String[] args) {
        for (int halo = 1; halo <= 10; halo++){
            if (halo == 4){
                break;
            }
            System.out.println("Looping For" + halo);
        }
        System.out.println("--------------------");
        for (int halo = 1; halo <= 10; halo++){
            if (halo % 2 == 1){
                continue;
            }
            System.out.println("Looping For" + halo);
        }
    }
}
