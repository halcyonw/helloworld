package shejimoshi.jieshiqimoshi.jiqiren.context;

public class LoopCommandNode extends Node {
    private int number;
    private Node commandNode;
    @Override
    public void interpret(Context context) {
        context.skipToken("Loop");
        number = context.currentNumber();
        context.nextToken();
         commandNode = new ExpressionNode();
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            commandNode.execute();
        }
    }
}
