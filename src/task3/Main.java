package task3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Plane(10,20,30000,150,2015,5000,100),
        new Ship(22,333,100000,100,2018,500,"Yalta"),
        new Саг(0,0,15000,180,2020)};

        for(Vehicle vehicle: vehicles){
            vehicle.showMe();
        }
    }
}
