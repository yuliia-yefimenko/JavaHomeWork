package com.pb.yefimenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int operand;
        System.out.println("Введите целое число от 0 до 100");
        operand = scan.nextInt();
        if ( operand = 0 ){
            System.out.println("диапазон [0-14]");
        };
        else if (operand >=1 || operand <=14){
            System.out.println("диапазон [0-14]");
        };
        else if (operand >=15 || operand <=35){
            System.out.println("диапазон [15-35]");
        };
        else if(operand >=36 || operand <=50){
            System.out.println("диапазон [36-50]");
        };
        else if(operand >=51 || operand <=100){
            System.out.println("диапазон [51-100]");
        };
    }
    )
}
