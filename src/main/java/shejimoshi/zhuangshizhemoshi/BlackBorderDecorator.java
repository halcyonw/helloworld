package shejimoshi.zhuangshizhemoshi;

public class BlackBorderDecorator extends ComponetDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("增加黑色边框");
    }
}
