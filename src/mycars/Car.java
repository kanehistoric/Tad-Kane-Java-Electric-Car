/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycars;

/**
 *
 * @author Tad Kane
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    private double odometer_reading;
    
    public Car(String make, String model, int year){
        //Initialize attributes to describe a car
        this.make = make;
        this.model = model;
        this.year = year;
        this.odometer_reading = 0;
}
    public String get_descriptive_name() {
        //Return a neatly formatted descriptive name.
        String long_name = Integer.toString(year) + ' ' + make + ' ' + model;
        return long_name;
    }

    public void read_odometer() {
        //Print a statement showing the car's mileage.
        System.out.println("This car has " + odometer_reading + " miles on it.");
    }
    
        
    public void update_odometer(double mileage) {
        /*Set the odometer reading to the given value.
        Reject the inputted value if it is less than the old odometer reading*/
        if(mileage >= odometer_reading)
            odometer_reading = mileage;
        else
            System.out.println("That mileage is less than the existing reading - Try again!");
    }

    public void increment_odometer(double miles) {
        //Add the given amount to the odometer reading.
        odometer_reading += miles;
    }
}


