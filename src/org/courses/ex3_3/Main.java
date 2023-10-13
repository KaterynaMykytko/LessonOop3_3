package org.courses.ex3_3;

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle(2345.7, 13000000, 240,2023);
        Plane plane = new Plane(68, 100, 2345.7, 13000000, 240,2023);
        Car car = new Car(15000, 5, 2345.7, 13000000, 240,2023);
        Ship ship = new Ship("Marina Panama",2500, 2345.7, 13000000, 240, 2023);

        vehicle.showInfo();
        plane.showInfo();
        car.showInfo();
        ship.showInfo();
    }
}
