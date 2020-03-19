package shejimoshi.guanchazhemoshi.game;

public class Player implements Observer {
    private String name;


  public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void help() {
        System.out.println("坚持住"+this.name+"来救你！");
    }

    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name + "被攻击");
        allyControlCenter.notifyObserver(name);
    }
}
