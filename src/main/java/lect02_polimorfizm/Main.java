package lect02_polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private boolean hasMoreWheels(Vehicle v1, Vehicle v2){
        return ((Car) v1).getWheelsNo() > ((Car) v2).getWheelsNo();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(123);
        System.out.println("Vechicle Type");
        System.out.println("Serial: " + vehicle.getSerialNo());
        System.out.println("Wheel Vechicle Type");
        WheelVehicle wheelVehicle = new WheelVehicle(234, 4);
        System.out.println("Serial: " + wheelVehicle.getSerialNo());
        System.out.println("Wheels: " + wheelVehicle.getWheelsNo());
        System.out.println("Car Type");
        Car car = new Car(456, 4,"Audi A4");
        System.out.println("Serial: " + car.getSerialNo());
        System.out.println("Wheels: " + car.getWheelsNo());
        System.out.println("Model: " + car.getModel());
        System.out.println(vehicle);
        System.out.println(wheelVehicle);
        System.out.println(car);
        System.out.println("POLIMORFIZM");
        WheelVehicle car1 = new Car(111,4,"BMW");
        System.out.println(car1);
        System.out.println(car1.getClass());
        Vehicle car2 = new Car(222,4,"VW");
        System.out.println(car2);
        System.out.println(car2.getClass());
        Object car3 = new Car(333, 6, "MAN");
        System.out.println(car3);
        System.out.println(car3.getClass());
        System.out.println("PORÓWNANIE");
        Main main = new Main();
        System.out.println(main.hasMoreWheels(car1, (Vehicle) car3));
        System.out.println(main.hasMoreWheels(car1, car2));

        List<String> elements = new ArrayList<String>();

    }
}
