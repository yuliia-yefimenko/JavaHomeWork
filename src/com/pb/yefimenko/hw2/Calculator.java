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
        String sign = scan.next();
        double result;
        switch (sign) {
            case "+":
                result=operand1+operand2;
                System.out.println(result);
                break;
            case "-":
                result=operand1-operand2;
                System.out.println(result);
                break;
            case "*":
                result=operand1*operand2;
                System.out.println(result);
                break;
            case "/": {
                if (operand2 == 0) {
                    System.out.print("Ошибка! Деление на ноль невозможно");}
                else
                {result=((double)operand1)/operand2;
                    System.out.print(result);}
                }
                break;
            default:
                System.out.println("Неверная операция, введите допустимое арифметическое действие");
        }
    }
}


