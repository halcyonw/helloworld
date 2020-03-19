package shejimoshi.jieshiqimoshi.jiqiren;

public class SetenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode distance;
    private AbstractNode action;

    public SetenceNode(AbstractNode Direction, AbstractNode Distance, AbstractNode action) {
        this.direction=Direction;
        this.action=action;
        this.distance=Distance;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
