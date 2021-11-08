package com.pb.yefimenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book ("Приключения","Иванов А.А.",2000);
        Book book2 = new Book ("Словарь","Сидоров Б.Б.",2010);
        Book book3 = new Book ("Энциклопедия","Петров В.В.",2020);

        Reader r1= new Reader( "Иванов И.И.",1111, "инженерный",
                "10.10.2000", 0991234567 );
        Reader r2= new Reader( "Петров П.П.",2222, "экономический",
                "10.10.2010",0501234567 );
        Reader r3= new Reader( "Васечкин В.В.",3333, "гуманитарный",
                "10.10.2020", 0631234567 );
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
