package creational.factorymethod.example3;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:37 PM
 */
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("CAR has been driven!");
    }
}
