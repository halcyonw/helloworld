package shejimoshi.guanchazhemoshi.gupiao;

import java.util.ArrayList;

abstract class Subject {
    private String name;
    private Double price;
    protected ArrayList<Observer> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void join(Observer observer) {
        list.add(observer);
    }

    public void quit(Observer observer) {
        list.remove(observer);
    }
    public abstract void forenotice();
}
