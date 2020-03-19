package shejimoshi.jieshiqimoshi.jiqiren.context;

import java.util.ArrayList;
import java.util.Iterator;

public class ExpressionNode extends Node {
  private ArrayList<Node>list=  new ArrayList<Node>();
    @Override
    public void interpret(Context context) {
        while (true) {
            if (context.currentToken() == null) {
                break;
            } else if (context.currentToken().equalsIgnoreCase("end")) {
                context.skipToken("end");
                break;
            }else{
                Node commandNode=new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public void execute() {
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Node) iterator.next()).execute();
        }
    }
}
