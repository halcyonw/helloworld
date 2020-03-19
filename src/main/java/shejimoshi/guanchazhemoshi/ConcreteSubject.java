package shejimoshi.guanchazhemoshi;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyy() {
        for (Object observer : observers) {
            ((Observer)observer).update();
        }
    }
}
