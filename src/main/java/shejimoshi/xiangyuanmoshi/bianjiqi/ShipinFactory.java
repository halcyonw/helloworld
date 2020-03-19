package shejimoshi.xiangyuanmoshi.bianjiqi;

import java.util.Hashtable;

public class ShipinFactory {
    private static Hashtable ht;
    private static class HoldClass{
        private final static ShipinFactory instance = new ShipinFactory();
    }

    //视频工厂类
    private ShipinFactory() {
        ht = new Hashtable();
        Shipin shipin1,shipin2;
        shipin1=new ZZshipin() ;
        ht.put("z", shipin1);
        shipin2 = new CCshipin();
        ht.put("c", shipin2);
    }

    public static ShipinFactory getInstance() {
        return HoldClass.instance;
    }

    public static Shipin getShipin(String name) {
        return (Shipin) ht.get(name);
    }
}
