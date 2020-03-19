package shejimoshi.zhuangshizhemoshi;

public class TextBox extends ComponetDecorator {
    public TextBox(Component component) {
        super(component);
    }

    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
