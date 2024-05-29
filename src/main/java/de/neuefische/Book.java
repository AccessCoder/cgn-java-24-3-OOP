package de.neuefische;

public class Book {

    //Variablen
    public String title; //Das merk ich mir! / Rene´s Buch / Julianes Buch
    public String isbn;
    public boolean wasRead;
    public String color;
    public double price;

    //Constructor
    public Book(String title, String isbn, boolean wasRead, String color, double price){
        this.title = title;
        this.isbn = isbn;
        this.wasRead = wasRead;
        this.color = color;
        this.price = price;
    }

    //Methoden -> Was kann das Buch?
    public void printBook(){
        System.out.println("Das Buch mit dem Titel " + title + " " +
                "und der isbn " + isbn +
                " in der Farbe " + color);
    }

}
