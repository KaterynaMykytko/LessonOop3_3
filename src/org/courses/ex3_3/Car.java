package org.courses.ex3_3;

public class Car extends Vehicle {

    private int weight;
    private int numOfDoors;

    public Car(int weight, int numOfDoors, double coordinates, int price, int speed, int productionYear) {
        super(coordinates, price, speed, productionYear);
        this.weight = weight;
        this.numOfDoors = numOfDoors;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    @Override
    public void showInfo(){
        System.out.println("It's a car - " + super.getCoordinates() + " " + super.getPrice() + " " + super.getSpeed() +
                " " + super.getProductionYear() + " " + this.getWeight() + " " + this.getNumOfDoors());
    }
}
