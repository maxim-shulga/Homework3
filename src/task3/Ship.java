package task3;

public class Ship extends Vehicle{
    protected int passengersCount;
    protected String homePort;

    public Ship(int xCoordinate, int yCoordinate, int price, int speed, int year, int passengersCount, String homePort) {
        super(xCoordinate, yCoordinate, price, speed, year);
        this.passengersCount = passengersCount;
        this.homePort = homePort;
    }
    @Override
    public void showMe(){
        System.out.println("Ship, " + " coordinates: " + this.xCoordinate + ":" + this.yCoordinate +
                ", price is: " + this.price +
                ", speed is: " + this.speed +
                ", year is " + this.year +
                ", numbers of passengers is " + this.passengersCount +
                ", home port is " + this.homePort);
    }
}
