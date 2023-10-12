package org.courses.ex3_3;

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle(2345.7, 13000000, 240,2023);
        Plane plane = new Plane(68, 100, 2345.7, 13000000, 240,2023);
        Car car = new Car(15000, 5, 2345.7, 13000000, 240,2023);
        Ship ship = new Ship("Marina Panama",2500, 2345.7, 13000000, 240, 2023);

        vehicle.showInfo();
        plane.showInfo();
        System.out.println(plane.getCoordinates() + " " + plane.getPrice() + " " + plane.getSpeed() + " " +
                plane.getProductionYear() + " " + plane.getHigh() + " " + plane.getNumPassengers());

        vehicle.showInfo();
        car.showInfo();
        System.out.println(car.getCoordinates() + " " + plane.getPrice() + " " + car.getSpeed() + " " +
                car.getProductionYear() + " " + car.getWeight() + " " + car.getNumOfDoors());

        vehicle.showInfo();
        ship.showInfo();
        System.out.println(ship.getCoordinates() + " " + ship.getPrice() + " " + ship.getSpeed() + " " +
                ship.getProductionYear() + " " + ship.getShipPort()+ " " + ship.getNumPassengers());

    }
}
