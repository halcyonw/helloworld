package shejimoshi.jianzaozhemoshi;

public class Test {
    public static void main(String[] args) {
        Builder concreteBuilder = new ConcreteBuilder();
        Direcrot direcrot = new Direcrot(concreteBuilder);
        Product product=direcrot.construct();

    }
}
