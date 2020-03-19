package shejimoshi.xiangyuanmoshi;

import shejimoshi.danlimoshi.Singleton;

import java.util.Hashtable;

public class IgochessmanFactory {

    private static Hashtable ht;
    private static class HolderClass {
        private final static IgochessmanFactory instance = new IgochessmanFactory();
    }

    //围棋棋子工厂类：享元工厂类，使用单例模式进行设计

    private IgochessmanFactory() {
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    //返回享元工厂类的唯一实例
    public static IgochessmanFactory getInstance() {
        return HolderClass.instance;
    }

    //通过key来获取存储在hashtable中的享元对象
    public static IgoChessman getIgochessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
