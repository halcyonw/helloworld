package shejimoshi.yuanxingmoshi.beiwanglu;

public class Chessman implements Cloneable {
    private String label;
    private int x;
    private int y;

    public Chessman() {
    }

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //保存进度
    public Chessman createMemento() {
        return this.clone();
    }
    //恢复进度
    public void restoryChessMemento(Chessman chessman) {
        this.label=chessman.label;
        this.x=chessman.x;
        this.y=chessman.y;
    }
    public Chessman clone() {
        Chessman chessman=null;
        try {
            Object clone = super.clone();
            return (Chessman) clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }
}
