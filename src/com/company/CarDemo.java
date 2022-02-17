package com.company;

public class CarDemo {
    // Create a new project in InteliJ named CarProgram using the Command Line App template
    //Rename your Main file to CarDemo(right-click -> Refactor -> Rename…)
    //Create a new Java class file (File -> New -> Java Class) named Car
    //Define your Car class with at least (3) instance variables such as color,
    // make, model, etc., and create accessor method for each variable
    // In your CarDemo class, write a program that instantiates a Car object named myCar,
    // uses accessor methods to set each of its instance variables and then gets their values,
    // and finally prints out information about your vehicle

    public static void main(String[] args) {
	// write your code here
        // create a car object named myCar
        Car myCar = new Car("Ford", "Bronco");

        //set each instance variable and then gets their values
//        myCar.setVehColor("Gray"); //color of car is blue
//        myCar.setVehMake("Ford"); //make is Ford
//        myCar.setVehModel("F150"); //model is F150

        System.out.println("I wish I drove a" + " " + myCar.getVehMake() + " " +
                myCar.getVehModel() + ".");
    }
}
