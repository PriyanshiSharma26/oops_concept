//Question: Create a Vehicle class with a method start(). Create subclasses Car and Bike that override the start() method. Write a main program to call the start() method using polymorphism.



 abstract class Vehicle{
    abstract void start();
 }

 class Car extends Vehicle
 {
    void start()
    {
        System.err.println("Car is Start");
    }

 }

 class Bike extends Vehicle{
    void start()
    {
        System.out.println("Bike is Start");
    }

 }

 class main_4
 {
    public static void main(String[] args)
     {
        Car c1=new Car();
        c1.start();
        Bike b1=new Bike();
        b1.start();


        }
 }