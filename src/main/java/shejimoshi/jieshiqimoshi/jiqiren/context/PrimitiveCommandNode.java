package shejimoshi.jieshiqimoshi.jiqiren.context;

public class PrimitiveCommandNode extends Node {
    private String name;
    private String text;
    @Override
    public void interpret(Context context) {
        name=context.currentToken();
        context.skipToken(name);
        if (!name.equalsIgnoreCase("print") && !name.equalsIgnoreCase("break")
                && !name.equalsIgnoreCase("space")) {
            System.out.println("非法命令");
        }
       if (name.equalsIgnoreCase("print")) {
            text=context.currentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equalsIgnoreCase("print")) {
            System.out.print(text);
        } else if (name.equalsIgnoreCase("space")) {
            System.out.print(" ");
        } else if (name.equalsIgnoreCase("break")) {
            System.out.println();
        }
    }
}
