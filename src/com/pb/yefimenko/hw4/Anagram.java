package com.pb.yefimenko.hw4;

import java.util.Scanner;

public class Anagram {
   // public static String format(String[] args){
    //    stringA = stringA.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");
   // }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scan.nextLine();
        System.out.println("Введите вторую строку");
        String s2= scan.nextLine();
        s1 = s1.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", ""); // убрать лишние символы из строк
        s2 = s2.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");
        String s1 = s1.length();
        String s2 = s2.length();
        char[] c1 = s1.toCharArray(); // сделать массив со строк
        char[] c2 = s2.toCharArray();

        if ( s1.length() != s2.length()) {
            return System.out.println("Слова не анаграммы");}
        else if (c1 != c2){
            return System.out.println("Слова не анаграммы");}
        else if (c1 == c2){
            return System.out.println("Слова анаграммы");}
        else if (s1.equals(s2)) {
            return System.out.println("Слова не анаграммы");}



        return System.out.println("Слова анаграммы");




        }
}
