package shejimoshi.xiangyuanmoshi.bianjiqi;

public class test {
    public static void main(String[] args) {
        Shipin shipin11, shipin12, shipin21, shipin22;
        ShipinFactory factory = ShipinFactory.getInstance();
       shipin11 = factory.getShipin("z");
       shipin12 = factory.getShipin("z");
       shipin21 = factory.getShipin("c");
       shipin22 = factory.getShipin("c");
       shipin11.display(new WeizhiDaxiao(1,1,1));
       shipin12.display(new WeizhiDaxiao(4,4,1));
       shipin21.display(new WeizhiDaxiao(1,1,5));
       shipin22.display(new WeizhiDaxiao(5,3,1));

    }
}
