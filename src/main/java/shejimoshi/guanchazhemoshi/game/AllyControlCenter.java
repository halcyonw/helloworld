package shejimoshi.guanchazhemoshi.game;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> list = new ArrayList<>();


    public void setAllyName(String allyName) {
        this.allyName=allyName;
    }

    public String getAllyName() {
        return allyName;
    }


    public void join(Observer observer) {
        System.out.println(observer.getName() + "加入" + this.allyName + "战队");
        list.add(observer);

    }

    public void quit(Observer observer) {
        System.out.println(observer.getName() + "退出" + this.allyName + "战队");
        list.remove(observer);
    }

    public abstract void notifyObserver(String name);
}
