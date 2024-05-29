package de.neuefische;

public class Main {

    public static void main(String[] args) {


//        Book dominicsBook = new Book("Das merk ich mir!", "6465-6465-64654-8765",false, "White", 24.99);
//        Book renesBook = new Book("Renés Buch", "6465-6465-64654-8765", true, "Blue", 34.99);
//        Book julianesBook = new Book("Julianes Buch","6465-6465-64654-8765", true, "Grey", 14.99 );
//
//        dominicsBook.printBook();
//        renesBook.printBook();
//        julianesBook.printBook();
//
//        Book[] books = {dominicsBook, renesBook, julianesBook};



        Car speedCar = new Car("BMW", "3", "Black", 2000, 1499.99);
        Car speedCar2 = new Car("BMW", "3", "Black", 2000, 15200.99);
        System.out.println(speedCar.getSpeed());


        System.out.println(speedCar);

        System.out.println(speedCar.equals(speedCar2));

    }


}