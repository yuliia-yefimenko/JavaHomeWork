package com.pb.yefimenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static void print (String in){              // метод напечатать строку
        System.out.println(in);
    }
    static toUpperCase(char[] charArr){
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");   // пользователь ввел строку
        String in = scan.nextLine();
        print (String in);
        char[] charArr = in.toCharArray();      // преобраз. строку в массив
        System.out.println( in.toString(charArr));
        System.out.println(in.toUpperCase());   // все символы в верхний регистр
    }
}
