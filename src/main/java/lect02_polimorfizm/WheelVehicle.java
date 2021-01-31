package lect02_polimorfizm;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class WheelVehicle extends Vehicle {
    private int wheelsNo;

    public WheelVehicle(int serialNo, int wheelsNo) {
        super(serialNo);
        this.wheelsNo = wheelsNo;
    }

    @Override
    public String toString() {
        return "WheelVehicle{" +
                "wheelsNo=" + wheelsNo +
                "} " + super.toString();
    }
}
