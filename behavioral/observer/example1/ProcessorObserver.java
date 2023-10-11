package behavioral.observer.example1;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:7:02 PM
 */
public class ProcessorObserver implements ScreenTouchObserver {
    @Override
    public void touched(String state) {
        System.out.println("Process notified by screen: touched");
    }

}
