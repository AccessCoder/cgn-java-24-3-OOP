package de.neuefische;

import java.util.Objects;

/**
 *
 Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc. V

 Step 2: Implement a method that "starts" the car and outputs a message. V

 Step 3: Create an object of the class 'Car' and call the method to start it. V

 Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed. V

 Step 5: Create a second object of the class 'Car', accelerate it, and display the speed. V
 */
public class Car {

   private String brand;
   private String model;
   private String color;
   private int yearOfMan;
   private int speed;
   private double price;

     public Car(String brand, String model, String color, int yearOfMan, double price){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfMan = yearOfMan;
        this.speed = 0;
        this.price = price;
    }

    //Getter -> Lesezugriff
    public int getSpeed(){
        return speed;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfMan() {
        return yearOfMan;
    }

    //Setter -> Schreibzugriff


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfMan(int yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //toString -> Wandelt Objekt in einen String um


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfMan=" + yearOfMan +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfMan == car.yearOfMan && speed == car.speed && Double.compare(car.price, price) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfMan, speed, price);
    }

    public void startCar(){
        System.out.println("The " + brand + " " + model + " got started");
    }

    public void accel(){
        speed++;
    }
}
