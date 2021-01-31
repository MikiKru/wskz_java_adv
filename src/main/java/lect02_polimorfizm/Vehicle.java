package lect02_polimorfizm;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor     // automatycznie dodaje konstruktor
@Data                   // automatyczne dodawanie getterów i setterów
public class Vehicle {
    private int serialNo;
}
