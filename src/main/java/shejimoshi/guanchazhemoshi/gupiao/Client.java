package shejimoshi.guanchazhemoshi.gupiao;

public class Client {
    public static void main(String[] args) {
       Subject a= new Stock("a股", 10.00);
        Stoker s1 = new Stoker("张三", a);
        a.join(s1);
        a.setPrice(50.00);

    }
}
