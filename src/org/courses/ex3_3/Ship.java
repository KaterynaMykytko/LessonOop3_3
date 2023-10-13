package org.courses.ex3_3;

public class Ship extends Vehicle {

    private String shipPort;
    private int numPassengers;

    public Ship (String shipPort, int numPassengers,double coordinates,int price, int speed, int productionYear ) {
        super(coordinates, price, speed, productionYear);
        this.shipPort = shipPort;
        this.numPassengers = numPassengers;
    }

    public String getShipPort() {
        return shipPort;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public void showInfo(){
        System.out.println("It's a ship - " + super.getCoordinates() + " " + super.getPrice() + " " +
                super.getSpeed() + " " + super.getProductionYear() + " " + this.getShipPort()+ " " +
                this.getNumPassengers());
    }
}
