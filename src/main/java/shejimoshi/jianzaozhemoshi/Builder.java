package shejimoshi.jianzaozhemoshi;

 abstract class Builder {
    //创建产品对象
    protected  Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

     public Product GetResult() {
         return product;
     }
}
