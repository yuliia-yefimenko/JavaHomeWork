package com.pb.yefimenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String symbol;
        String sign = "+, -, *, /";
        System.out.println("Введите целое цифровое значение operand1 ");
        operand1 = scan.nextInt();
        System.out.println("Введите целое цифровое значение operand2 ");
        operand2 = scan.nextInt();
        System.out.println("+, -, *, /");
        scan.nextLine();
        symbol = scan.nextLine();

        System.out.println(" operand1 =" + operand1+ " operand2 = " + operand2 + "symbol = " + symbol );}


    switch ( symbol ){
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
            if ( operand2 < 0) {
                System.out.print("Ошибка! Деление на ноль невозможно, ЕСЛИ ВЫ НЕ КЕРНЕС");
            } else {
                System.out.print("operand1/operand2");
            }
            break;
        default:
            System.out.println("Неверная операция, введите допустимое арифметическое действие");
    }

}
