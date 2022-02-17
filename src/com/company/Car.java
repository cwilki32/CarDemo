package com.company;

public class Car {
    //Define your Car class with at least (3) instance variables such as color,
    // make, model, etc., and create accessor method for each variable
//    private String vehColor; removed for example
    private String vehMake;
    private String vehModel;

    // uses accessor methods to set each of its instance variables and then gets their values, still using "this"
    //for if I don't want to parameterize

    //accessor setter methods
 /*   public void setVehColor(String vehColor) {
        this.vehColor = vehColor;
    }
    public void setVehMake(String vehMake) {
        this.vehMake = vehMake;
    }
    public void setVehModel(String vehModel) {
        this.vehModel = vehModel;
    }
*/
    //constructor
    public Car(String vehMake, String vehModel) {//using new constructor and this. modifier
        this.vehMake = vehMake;
        this.vehModel = vehModel;
    }
    //accessor getter methods

 //   public String getVehColor() { old method removed for example
 //       return vehColor;
 //   }

    public String getVehMake() {
        return vehMake;
    }
    public String getVehModel() {
        return vehModel;
    }
}
