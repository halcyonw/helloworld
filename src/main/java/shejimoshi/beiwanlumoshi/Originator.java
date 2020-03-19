package shejimoshi.beiwanlumoshi;

public class Originator {
    private String state;

    public Originator() {
    }

    public Originator(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this);
    }

    //根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento m) {
        state=m.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
