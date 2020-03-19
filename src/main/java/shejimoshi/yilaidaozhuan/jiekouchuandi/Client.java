package shejimoshi.yilaidaozhuan.jiekouchuandi;

public class Client {
    public static void main(String[] args) {
        IDriver zhangsan = new Driver();
        Icar benz = new Benz();
        Icar bmw=new BMW();
        zhangsan.drive(benz);
        zhangsan.drive(bmw);
    }
}
