package com.example.admin.carswithfragments;

/**
 * Created by Admin on 10/5/2017.
 */

public class Car {
    String model, type, year;

    public Car(String model, String type, String year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
