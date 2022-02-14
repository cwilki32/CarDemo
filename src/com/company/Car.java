package com.company;

public class Car {
    //Define your Car class with at least (3) instance variables such as color,
    // make, model, etc., and create accessor method for each variable
    private String vehColor;
    private String vehMake;
    private String vehModel;

    // uses accessor methods to set each of its instance variables and then gets their values,

    //accessor setter methods
    public void setVehColor(String color) {
        vehColor = color;
    }
    public void setVehMake(String make) {
        vehMake = make;
    }
    public void setVehModel(String model) {
        vehModel = model;
    }

    //accessor getter methods

    public String getVehColor() {
        return vehColor;
    }

    public String getVehMake() {
        return vehMake;
    }
    public String getVehModel() {
        return vehModel;
    }
}
