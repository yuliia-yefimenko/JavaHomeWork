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
        System.out.println(array[9]);    // упрощаем ТАК МОЖНО? Ведь я хочу чтоб просуммировалось, то , что ввел пользователь
        System.out.println(Arrays.toString(array));

        for ( int i = 0; i < array.length){   // сумма массива
            sum = (array [1] + array [2] + array [3] + array [4] + array [5] + array [6] + array [7] + array [8]  + array [9] );
            System.out.println("Сумма" +sum );
        }
        if ( int [i] > 0) {
            sum:=sum+i;
            System.out.println("Сумма положительных элементов массива" + sum);
        }
        boolean isSorted = false; // пузырьковая сортировка
        int x;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    x= array[i];
                    array[i] = array[i+1];
                    array[i+1] = x;
                }
            }
        }
    }
}
