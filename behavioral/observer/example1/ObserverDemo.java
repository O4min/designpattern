package behavioral.observer.example1;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:7:55 PM
 */
public class ObserverDemo {
    public static void main(String[] args) {
        ScreenEventSource eventSource = new ScreenEventSource();
        var securityObserver = new SecurityObserver();
        eventSource.attach(securityObserver);
        eventSource.attach(new ProcessorObserver());
        eventSource.setState("TOUCH");
        eventSource.remove(securityObserver);
        eventSource.setState("SECOND TOUCH");
    }
}
