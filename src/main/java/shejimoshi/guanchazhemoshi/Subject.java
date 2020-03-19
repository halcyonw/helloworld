package shejimoshi.guanchazhemoshi;

import java.util.ArrayList;

abstract class Subject {

    protected ArrayList<Observer> observers = new ArrayList();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyy();
}
