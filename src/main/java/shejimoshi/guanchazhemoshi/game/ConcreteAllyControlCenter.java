package shejimoshi.guanchazhemoshi.game;

public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName+"战队紧急通知,盟友"+name+"遭到敌人攻击");
        for (Observer player : list) {

            if (!((Observer)player).getName().equalsIgnoreCase(name)) {
                ((Observer)player). help();
            }
        }
    }
}
