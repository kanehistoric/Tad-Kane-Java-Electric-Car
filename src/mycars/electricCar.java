
package mycars;

/**
 *
 * @author Tad Kane
 */
public class electricCar extends Car {
    //Models aspects of a car, specific to electric vehicles.

    Battery battery;
    
    public electricCar( String make, String model, int year) {
        //Initializes attributes of the parent class. Then initializes attributes specific to an electric car.
        super(make, model, year);
        battery = new Battery(70);            //new child attribute 'battery' which = Battery class object.

}
}
    
