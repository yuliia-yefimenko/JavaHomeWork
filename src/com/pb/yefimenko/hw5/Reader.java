package com.pb.yefimenko.hw5;

public class Reader {
    String name;
    int biletNumber;
    String fakultet;
    String dateOfBirth;
    String telephone;

    public Reader(String name, int biletNumber, String fakultet, String dateOfBirth, String telephone) {
        this.name = name;
        this.biletNumber = biletNumber;
        this.fakultet = fakultet;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;}
    public void takeBook (int bookCount) {
        System.out.println(this.name + " взял " + bookCount + " книг");}
    public void returnBook(int bookCount){
        System.out.println(this.name + " вернул " + bookCount + " книг");}
}
