package shejimoshi.xiangyuanmoshi;

public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinatese coordinatese) {
        System.out.println("棋子颜色"+this.getColor()+"棋子位置"+coordinatese.getX()+","+coordinatese.getY());
    }
}
