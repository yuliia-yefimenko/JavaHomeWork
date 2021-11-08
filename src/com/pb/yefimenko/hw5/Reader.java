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
    public void takeBook (String ... nazva) {
        System.out.println(this.name + " взял книги: ");
        for(String name: nazva) {
            System.out.println(name);}}
    public void returnBook (String ... nazva) {
        System.out.println(this.name + " вернул книги: ");
        for(String name: nazva) {
            System.out.println(name);}}
    public void takeBook(Book... books) {
        System.out.println(this.name + " взял книги: ");
        for(Book book: books) {
            System.out.println(book.getNazva() + " " + book.getAvtor() + " " + book.getYear());}}
    public void returnBook(Book... books) {
        System.out.println(this.name + " вернул книги: ");
        for(Book book: books) {
            System.out.println(book.getNazva() + " " + book.getAvtor() + " " + book.getYear());
        }
    }
}
