package shejimoshi.xiangyuanmoshi;

public class Client {
    public static void main(String[] args) {
        IgoChessman black1,black2,black3,white1,white2;
        IgochessmanFactory factory = IgochessmanFactory.getInstance();
     black1 = factory.getIgochessman("b");
     black2 = factory.getIgochessman("b");
     black3 = factory.getIgochessman("b");
        System.out.println("判断两颗黑子是否相同："+(black1==black2));
        white1 = factory.getIgochessman("w");
        white2 = factory.getIgochessman("w");
        System.out.println("判断两颗白子是否相同" + (white1 == white2));
        black1.display(new Coordinatese(1,2));
        black2.display(new Coordinatese(3, 4));
        black3.display(new Coordinatese(1,3));
        white1.display(new Coordinatese(2, 6));
        white2.display(new Coordinatese(2,4));
    }

}
