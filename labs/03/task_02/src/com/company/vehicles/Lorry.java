package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private double cargoCapacity;

    public Lorry() {
        super();
        cargoCapacity = 0.0;
    }

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine engine, double cargoCapacity) {
        super(brand, carClass, weight, driver, engine);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъемность: " + cargoCapacity + " тонн";
    }
}
