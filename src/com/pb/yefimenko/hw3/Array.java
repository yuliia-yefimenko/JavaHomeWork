package com.pb.yefimenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] array = new int[3];
        int sum = 0,posit = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите "+ i +"й элемент массива");
            array[i] = scan.nextInt();
            sum = sum + array[i];
            if (array[i] >0) {
                posit = posit +1;
            }
        }
        System.out.println("Количество положительных элементов массива " + posit);
        System.out.println("Сумма всех элементов массива "+ sum );
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
        for ( int y = 0; y < array.length ; y++ ){
        System.out.println("Сортировка пузырьком " + array[y]);}

    }
}
