package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {
        this.brand = "null";
        this.carClass = "null";
        this.weight = 0.0;
        this.driver = new Driver();
        this.engine = new Engine();
    }

    public Car(String brand, String carClass, double weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Класс: " + carClass + ", Вес: " + weight +
                "\nВодитель: " + driver.getFullName() + " (Стаж: " + driver.getDrivingExperience() + " лет)" +
                "\nМотор: " + engine.getPower() + " л.с., Производитель: " + engine.getManufacturer();
    }
}
