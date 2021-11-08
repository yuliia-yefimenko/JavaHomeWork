package com.pb.yefimenko.hw5;

public class Book {
    private String nazva;
    private String avtor;
    private int year;
    public Book(String nazva,String avtor,int year) {
        this.nazva = nazva;
        this.avtor = avtor;
        this.year =  year;
    }
    public String getNazva() {return nazva;}
    public String getAvtor() {return avtor;}
    public int getYear() {return year;}
}
