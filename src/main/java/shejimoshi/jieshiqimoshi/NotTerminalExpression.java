package shejimoshi.jieshiqimoshi;


public class NotTerminalExpression extends  AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NotTerminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left=left;
        this.right=right;
    }
    @Override
    public void interpret(Context ctx) {

    }
}
