package shejimoshi.jianzaozhemoshi;

public class Direcrot {
    private Builder builder;

    public Direcrot(Builder builder) {
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.GetResult();
    }
}
