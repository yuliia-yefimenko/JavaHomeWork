package com.pb.yefimenko.hw5;

public class Reader {
    String name;
    int biletNumber;
    String fakultet;
    String dateOfBirth;
    int telephone;
    Object Reader;
    public static void main(String[] args) {
        Book book1 = new Book(nazva:"Приключение", avtor:"Автор1 А.А.", year: 2000 );
        Book book2 = new Book(nazva: "Словарь", avtor:"Автор2 Б.Б.", year: 2010);
        Book book3 = new Book(nazva: "Энциклопедия",avtor:"Автор3 В.В.", year: 2020 );
        Book[] ArrayBook = {book1, book2, book3};

        for (Book x = ArrayBook) {
            System.out.println(x.nazva+x.avtor+x.year());
        }
        Reader r1= new Reader( name:"Иванов И.И.",biletNumber:1111, fakultet:"инженерный",
                dateOfBirth: "10.10.2000", telephone:0991234567 );
        Reader r2= new Reader( name:"Петров П.П.",biletNumber:2222, fakultet:"экономический",
                dateOfBirth: "10.10.2010", telephone:0501234567 );
        Reader r3= new Reader( name:"Васечкин В.В.",biletNumber:3333, fakultet:"гуманитарный",
                dateOfBirth: "10.10.2020", telephone:0631234567 );
        Reader[] R ={ r1,r2,r3 };
        for (Reader y = R) {
            System.out.println(y.name+y.biletNumber+y.fakultet+y.dateOfBirth+y.telephone());


        String takeBook(){
            for (x=book1;x<ArrayBook.length;x++),(y=r1,y<R.length; y++){
            return "[ Читатель"+y+"взял книгу"+ x+"название:"+x.nazva+", автор: "+x.avtor+", год: "+x.year+"]";
        }
        String returnBook(){
            return "[ Вернул книгу название: "+nazva+", автор: "+avtor+", год: "+year+"]";
        }
    }






    ///// public void takeBook (String name, String... namebooks) {
    //        System.out.println(name + "взял несколько книг" + namebook);
    //        for (String namebook : namebooks) {
    //
    //            System.out.println(namebook);
    //        создавать массив примерно так:
    //Reader[] readerArray = new Reader[4];
    //
    //получать свойства и методы так:
    //bookArray[1].getTitle()
    //readerArray[3].takeBook(3);  - взять 3 книги
}
