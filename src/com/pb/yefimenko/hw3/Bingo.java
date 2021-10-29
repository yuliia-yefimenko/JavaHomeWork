package com.pb.yefimenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String[] args){
        System.out.println("Отгадайте целое число в диапазоне от 0 до 100");
        System.out.println("Для выхода из программы введите число меньше 0");
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int counter1 = random.nextInt(101);
        System.out.println("Программа загадала целое число в диапазоне от 0 до 100");
        System.out.println("Введите предполагаемое число в диапазоне от 0 до 100");
        int counter2 = in.nextInt();
        final int MAX_ATTEMPT = 101; // ведь вариантов от 0 до 100
        int attempt = 0;
        while (attempt<MAX_ATTEMPT){
            attempt++;
            System.out.println("Попытка"+attempt+":");
            if (counter2 <0) {
                break;
            }
            if (counter2 < 0 | counter2 >100) {
                System.out.println("Число не входит в диапазон");
                break;
            }
            if (counter1 == counter2){
                System.out.println("Урра!Вы угадали с"+attempt+"попытки");
                break;
            }
        }
        System.out.println("Конец игры");
    }
}