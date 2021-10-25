package com.pb.yefimenko.hw3;

import java.util.Scanner;

public class BingoDoWhile {
    public static void main (String[] args){
        System.out.println("Отгадайте целое число в диапазоне от 0 до 100");
        System.out.println("Для выхода из программы введите - exit.");
        final int MAX_ATTEMPT = 101; // ведь вариантов от 0 до 100
        int attempt = 0;
        int counter = 25;
        Scanner in = new Scanner(System.in);
        counter = in.nextInt();
        do {attempt++;
            System.out.println("Попытка" + attempt + ":");
            if (counter==("exit")) {
                break;
            }
            if (counter < 0 | counter > 100) {
                System.out.println("Число не входит в диапазон");
                break;
            }
            if (counter > 0 | counter < 24 & counter > 26) {
                System.out.println("Не угадали");
                continue;
            }
        } while((attempt<MAX_ATTEMPT) || counter==25);{
            System.out.println("Урра!Вы угадали с"+attempt+"попытки");
            break;)
        }
        System.out.println("Конец игры");
    }
}
