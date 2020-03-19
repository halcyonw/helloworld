package shejimoshi.zhuangshizhemoshi;

public class Test {
    public static void main(String[] args) {

        Component window=new Window();
        Component component1 = new ScrollBarDecorator(window);
        BlackBorderDecorator BlackBorderDecorator = new BlackBorderDecorator(component1);
        BlackBorderDecorator.display();
    }
}
