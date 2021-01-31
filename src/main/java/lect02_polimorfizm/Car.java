package lect02_polimorfizm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Car extends WheelVehicle {
    private String model;

    public Car(int serialNo, int wheelsNo, String model) {
        super(serialNo, wheelsNo);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}
