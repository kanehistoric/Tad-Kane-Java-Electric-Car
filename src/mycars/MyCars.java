/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycars;

import java.util.Scanner;

/**
 *
 * @author Tad Kane
 */
public class MyCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //public class from car import Car
    Car my_gasCar1 = new Car("volkswagen", "beetle", 2016);
    System.out.println(my_gasCar1.get_descriptive_name());

    Car my_gasCar2 = new Car("ford", "fairmont", 1980);
    System.out.println(my_gasCar2.get_descriptive_name());

    electricCar my_electricCar1 = new electricCar("tesla", "roadster", 2016);
    System.out.println(my_electricCar1.get_descriptive_name());
    
    Scanner input = new Scanner(System.in);
    System.out.println("Battery capacities of current EVs range from a mere 17.6 kWh\n "
            + "in the Smart EQ ForTwo with a range of just 58 miles, up to 100 kWh in\n "
            + "the Tesla Model S and Model X that can run for over 300 miles before\n "
            + "needing a charge.\nWhat is the size of the battery? ");
    double batterySize = input.nextDouble();
   
    my_electricCar1.battery.battery_size = batterySize;
    my_electricCar1.battery.get_range();

    electricCar my_electricCar2 = new electricCar("tesla", "model S", 2018);
    //did not provide battery size, so use default in constructor of 70-kWh
    System.out.println(my_electricCar2.get_descriptive_name());
    my_electricCar2.battery.describe_battery();
    my_electricCar2.battery.get_range();
    
    while(true){
        System.out.println("Beetle, Fairmont, Roadster, or Model S? Press 'q' to quit program.");
        String select_car = input.next();
        
        if (select_car.equalsIgnoreCase("q"))
            break;
        if (select_car.equalsIgnoreCase("Beetle")) {
            System.out.println("What is the new odometer reading?");
            double new_odom = input.nextDouble();
            my_gasCar1.update_odometer(new_odom);
            my_gasCar1.read_odometer();
        }
        
        if (select_car.equalsIgnoreCase("Fairmont"))  {
            System.out.println("What is the new odometer reading?");
            double new_odom = input.nextDouble();
            my_gasCar2.update_odometer(new_odom);
            my_gasCar2.read_odometer();
                    }

        if (select_car.equalsIgnoreCase("Roadster")) {
            my_electricCar1.battery.describe_battery(); 
            /*'battery' is an attribute of my_tesla, BUT! remember, it is
                a Battery class object. ElectricCarClassObject.ElectricCarClassObjectAttribute(which is itself
                a Battery class Object).BatteryClassMethod*/
            my_electricCar1.battery.get_range();
        }

        if (select_car.equalsIgnoreCase("Model S")) {
            my_electricCar2.battery.describe_battery();
            my_electricCar2.battery.get_range();
        }
        }
    }
}