package com.pb.yefimenko.hw5;

public class Library {
    public static void main(String[] args) {
    Book[] ArrayBook = {book1, book2, book3};
    Reader[] R ={r1,r2,r3 };
    for (Book x = ArrayBook) {
        System.out.println(x.nazva+x.avtor+x.year());
    }
    for (Reader y = R) {
        System.out.println(y.name+y.biletNumber+y.fakultet+y.dateOfBirth+y.telephone());}

    for (x=book1;x<ArrayBook.length;x++),(y=r1,y<R.length; y++){
        return System.out.println("[ Читатель"+y+"взял книгу"+ x+"название:"+x.nazva+", автор: "
                +x.avtor+ ", год: "+x.year+"]")}
    for (x=book1;x<ArrayBook.length;x++),(y=r1,y<R.length; y++){
        return System.out.println("[ Читатель"+y+"взял книгу"+ x+"название:"+x.nazva+", автор: "
                +x.avtor+ ", год: "+x.year+"]");}
    }
