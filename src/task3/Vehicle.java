package task3;

public class Vehicle {
    protected int xCoordinate, yCoordinate;
    protected int price, speed, year;

    public Vehicle(int xCoordinate, int yCoordinate, int price, int speed, int year) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showMe(){
        System.out.println("Vehicle, " + " coordinates: " + this.xCoordinate + ":" + this.yCoordinate +
                ", price is: " + this.price +
                ", speed is: " + this.speed +
                ", year is " + this.year);
    }
}
