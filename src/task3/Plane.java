package task3;

public class Plane extends Vehicle{
    protected int height, passengersCount;

    public Plane(int xCoordinate, int yCoordinate, int price, int speed, int year, int height, int passengersCount) {
        super(xCoordinate, yCoordinate, price, speed, year);
        this.height = height;
        this.passengersCount = passengersCount;
    }
    @Override
    public void showMe(){
        System.out.println("Plane, " + " coordinates: " + this.xCoordinate + ":" + this.yCoordinate +
                ", price is: " + this.price +
                ", speed is: " + this.speed +
                ", year is " + this.year +
                ", height is " + this.height +
                ", numbers of passengers is " + this.passengersCount);
    }
}
