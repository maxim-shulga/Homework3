package task3;

public class Саг extends Vehicle{
    public Саг(int xCoordinate, int yCoordinate, int price, int speed, int year) {
        super(xCoordinate, yCoordinate, price, speed, year);
    }
    @Override
    public void showMe(){
        System.out.println("Car, " + " coordinates: " + this.xCoordinate + ":" + this.yCoordinate +
                ", price is: " + this.price +
                ", speed is: " + this.speed +
                ", year is " + this.year);
    }
}
