package behavioral.observer.example3;

import behavioral.observer.example1.ProcessorObserver;
import behavioral.observer.example1.ScreenEventSource;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:8:22 PM
 */
public class DemoObserver {

    public static void main(String[] args) {
        var screenEventSource = new ScreenEventSource();
        screenEventSource.attach(state -> System.out.println("Security notified by screen: touched"));
        screenEventSource.attach(state -> System.out.println("Process notified by screen: touched"));
        screenEventSource.setState("TOUCHED");

        /**
         in this way there is no way to implement concrete classes of observer
         because they just implement a behavior, but now thanks to the java lambdas
         We can just create a behavior in lines!
         */
    }
}
