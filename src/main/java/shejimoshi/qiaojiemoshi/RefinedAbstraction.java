package shejimoshi.qiaojiemoshi;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        implementor.opeartionImpl();
    }
}
