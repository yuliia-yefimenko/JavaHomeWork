package com.pb.yefimenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args){
        System.out.println("Отгадайте целое число в диапазоне от 0 до 100");
        System.out.println("Для выхода из программы введите число меньше 0");
        Random random = new Random();
        int counter = (int) ( Math.random() * 101 );
        final int MAX_ATTEMPT = 101; // ведь вариантов от 0 до 100
        int attempt = 0;
        Scanner in = new Scanner(System.in);
        while (attempt<MAX_ATTEMPT){
            attempt++;
            System.out.println("Попытка"+attempt+":");
            counter = in.nextInt();
            if (counter<0) {
                break;
            }
            if (counter < 0 | counter>100) {
                System.out.println("Число не входит в диапазон");
                break;
            }
            if (counter == int counter){
                System.out.println("Урра!Вы угадали с"+attempt+"попытки");
                break;
            }
        }
        System.out.println("Конец игры");
    }
}