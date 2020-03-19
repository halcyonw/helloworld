package shejimoshi.guanchazhemoshi.game;

public class Client {
    public static void main(String[] args) {
        AllyControlCenter ac;
        ac = new ConcreteAllyControlCenter("金庸群侠");
        Observer p1,p2,p3,p4;
        p1 = new Player("杨过");
        ac.join(p1);
        p2 = new Player("令狐冲");
        ac.join(p2);
        p3 = new Player("张无忌");
        ac.join(p3);
        p4= new Player("乔峰");
        ac.join(p4);
        p1.beAttacked(ac);
    }
}
