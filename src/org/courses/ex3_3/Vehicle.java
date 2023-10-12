package org.courses.ex3_3;

public class Vehicle {
    protected double coordinates;
    protected int price;
    protected int speed;
    protected int productionYear;

    public Vehicle(double coordinates, int price, int speed, int productionYear){
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.productionYear = productionYear;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void showInfo(){};
}
