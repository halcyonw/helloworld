package shejimoshi.zhuangshizhemoshi;

public class ComponetDecorator extends Component {

    private Component component;

    public ComponetDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
