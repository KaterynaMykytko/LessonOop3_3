package org.courses.ex3_3;

public class Plane extends Vehicle{

    private int high;
    private int numPassengers;

    public Plane(int high, int numPassengers, double coordinates,int price, int speed, int productionYear){
        super(coordinates, price, speed, productionYear);
        this.high = high;
        this.numPassengers = numPassengers;
    }

    public int getHigh() {
        return high;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    @Override
    public void showInfo(){
        System.out.println("It's a plane - " + this.getCoordinates() + " " + this.getPrice() + " " + this.getSpeed()
                + " " + this.getProductionYear() + " " + this.getHigh() + " " + this.getNumPassengers());
    }
}
