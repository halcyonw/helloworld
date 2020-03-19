package shejimoshi.jianzaozhemoshi;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        System.out.println("西墙");


    }

    @Override
    public void buildPartB() {
        System.out.println("北墙");

    }

    @Override
    public void buildPartC() {
        System.out.println("南墙");

    }
}
