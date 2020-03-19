package shejimoshi.zhuangshizhemoshi;

public class ScrollBarDecorator extends ComponetDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void approve() {
        System.out.println("特有功能");
    }
    public void display() {
        this.setScrollBar();
       super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}
