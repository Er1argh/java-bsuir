package com.company.professions;

public class Driver extends Person {
    private int drivingExperience;

    public Driver() {
        super();
        drivingExperience = 0;
    }

    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
