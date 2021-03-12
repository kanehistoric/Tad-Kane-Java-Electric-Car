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
public class Battery {
    
    //A simple attempt to model a battery for an electric car.

    public double battery_size = 70;
    public double battery_range_factor;
    
    public Battery(double battery_size) {
        //Initialize the battery's attributes
        this.battery_size = battery_size;
        this.battery_range_factor = 3.3;
    }

    public void describe_battery(){
        //Print a statement describing the battery size.
        System.out.println("This has a " + battery_size + "-kWh battery.");
    }

    public void get_range() {
        //Print a statement about the range this battery provides.
        System.out.printf("This car can go approximately %.2f miles on a full charge.\n",battery_size/battery_range_factor);
        
    }
}