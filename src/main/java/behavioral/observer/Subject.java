package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers =
            new ArrayList<>();

    public void subscribe(Observer observer) {

        if (observer != null) {
            observers.add(observer);
        }
    }

    public void unsubscribe(Observer observer) {

        observers.remove(observer);
    }

    public void notifyObservers(String message) {

        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
