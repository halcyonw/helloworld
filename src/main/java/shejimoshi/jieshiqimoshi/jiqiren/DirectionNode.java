package shejimoshi.jieshiqimoshi.jiqiren;

public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }
    @Override
    public String interpret() {
        if (direction.equals("up")) {
            return "向上";
        } else if (direction.equals("down")) {
            return "向下";
        }else if (direction.equals("left")) {
            return "向左";
        }else if (direction.equals("right")) {
            return "向右";
        }else {
            return "无效指令";
        }
    }
}
