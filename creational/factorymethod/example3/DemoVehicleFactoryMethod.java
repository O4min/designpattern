package creational.factorymethod.example3;

import static creational.factorymethod.example3.VehicleFactoryMethod.*;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:45 PM
 */
public class DemoVehicleFactoryMethod {

    public static void main(String[] args) {
        CAR.create().drive();
        SCOOTER.create().drive();
        BICYCLE.create().drive();
    }
}
