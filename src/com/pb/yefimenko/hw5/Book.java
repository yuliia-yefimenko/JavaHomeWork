package com.pb.yefimenko.hw5;

public class Book {
    String nazva;
    String avtor;
    int year;
    int bookCount=0;
    public static int takeBook() {
        return int bookCount++;
    }
    public Book(String nazva,String avtor,int year,int bookCount) {
        this.nazva = nazva;
        this.avtor = avtor;
        this.year =  year;
        bookCount ++;
    }
}
