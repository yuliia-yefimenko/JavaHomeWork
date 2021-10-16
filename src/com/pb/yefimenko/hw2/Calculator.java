package com.pb.yefimenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое цифровое значение operand1 ");
        int operand1 = scan.nextInt();
        System.out.println("Введите целое цифровое значение operand2 ");
        int operand2 = scan.nextInt();
        System.out.println("Введите допустимый знак арифметической операции + - * /");
        ????????
        String symbol = scan.nextInt();;  или след. назначение символа и вместо symbol правильно написать sign
        int symbol = scan.nextInt();
        switch (symbol) {
            case "+":
                System.out.println("operand1+operand2");
                break;
            case "-":
                System.out.println("operand1-operand2");
                break;
            case "*":
                System.out.println("operand1*operand2");
                break;
            case "/":
                if (operand2 < 0) {
                    System.out.print("Ошибка! Деление на ноль невозможно, ЕСЛИ ВЫ НЕ КЕРНЕС");
                } else {
                    System.out.print("operand1/operand2");
                }
                break;
            default:
                System.out.println("Неверная операция, введите допустимое арифметическое действие");
        }
        System.out.println("\nРезультат: \n");
        System.out.println(" operand1 =" + operand1 + " operand2 = " + operand2 + "symbol = " + symbol);
    }
}
