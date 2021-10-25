package com.pb.yefimenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] array = new int[10];
        int i = array.length;
        int sum = 0;
        array [0]=scan.nextInt();
        System.out.println(array[0]);
        array [1]=scan.nextInt();
        System.out.println(array[1]);
        array [2]=scan.nextInt();
        System.out.println(array[2]);
        array [3]=scan.nextInt();
        System.out.println(array[3]);
        array [4]=scan.nextInt();
        System.out.println(array[4]);
        array [5]=scan.nextInt();
        System.out.println(array[5]);
        array [6]=scan.nextInt();
        System.out.println(array[6]);
        array [7]=scan.nextInt();
        System.out.println(array[7]);
        array [8]=scan.nextInt();
        System.out.println(array[8]);
        array [9]=scan.nextInt();
        System.out.println(array[9]);    // упрощаем:
        System.out.println(Arrays.toString(array));

        for ( int i = 0; i < array.length){
            sum = (array [1] + array [2] + array [3] + array [4] + array [5] + array [6] + array [7] + array [8]  + array [9] );
            System.out.println("Сумма" +sum );
        }
        if( i%2==0){
            System.out.println("Вы ввели четное число");
        }
        if else (i>0; i <= array.length;) {
            System

        }
    }
}
