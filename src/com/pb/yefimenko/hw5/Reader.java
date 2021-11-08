package com.pb.yefimenko.hw5;

public class Reader {
    String name;
    int biletNumber;
    String fakultet;
    String dateOfBirth;
    int telephone;

    public Reader (String name, int biletNumber, String fakultet,  String dateOfBirth, int telephone) {
        this.name = name;
        this.biletNumber = biletNumber;
        this.fakultet = fakultet;
        this.dateOfBirth = dateOfBirth;
        this.telephone = telephone;
    }

    public void takeBook (int bookCount) {
        System.out.println(this.name + " взял " + bookCount + " книг");
    }
    public void returnBook(int bookCount){
        System.out.println(this.name + " вернул " + bookCount + " книг");
        }
    }






    ///// public void takeBook (String name, String... namebooks) {

    //
    //получать свойства и методы так:
    //bookArray[1].getTitle()
    //readerArray[3].takeBook(3);  - взять 3 книги
}
