package shejimoshi.jieshiqimoshi.jiqiren.context;

public class CommandNode extends Node {
    private Node node;
    @Override
    public void interpret(Context context) {
        if (context.currentToken().equalsIgnoreCase("loop")) {
            node = new LoopCommandNode();
            node.interpret(context);

        }else {
            node=new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
