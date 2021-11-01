package com.pb.yefimenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scan.nextLine();
        System.out.println("Введите вторую строку");
        String s2= scan.nextLine();
        s1 = s1.replaceAll("[^0-9a-zA-Zа-яёА-ЯЁ]", ""); // убрать лишние символы из строк
        s2 = s2.replaceAll("[^0-9a-zA-Zа-яёА-ЯЁ]", "");
        char[] c1 = s1.toCharArray(); // сделать массив со строк
        char[] c2 = s2.toCharArray();
        if ( s1.length() != s2.length()) {
            System.out.println("Слова не анаграммы");}
        Arrays.sort(c1);
        System.out.println(Arrays.toString(c1));
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c2));
        if (Arrays.toString(c1).equals(Arrays.toString(c2))) {
            System.out.println("Слова анаграммы");}
        else{
            System.out.println("Слова не анаграммы");}
        System.out.println("Конец");
    }
}
