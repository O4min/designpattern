package behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: A.Hosseini
 * Date:10/10/2023
 * Time:7:03 PM
 */
public class ScreenEventSource {

    private List<ScreenTouchObserver> screenEvents = new ArrayList<>();
    private String state = "CLEAN";

    public void setState(String state) {
        this.state = state;
        notifyHardware(state);
    }

    private void notifyHardware(String state) {
        for (ScreenTouchObserver screenEvent : screenEvents) {
            screenEvent.touched(state);
        }
    }

    public void attach(ScreenTouchObserver observer) {
        screenEvents.add(observer);
    }

    public void remove(ScreenTouchObserver observer) {
        screenEvents.remove(observer);
    }
}