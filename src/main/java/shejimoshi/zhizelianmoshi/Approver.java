package shejimoshi.zhizelianmoshi;

abstract class Approver {
    protected  Approver successor;
    protected String name;

    public Approver(Approver successor) {
        this.successor = successor;
    }

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor=successor;
    }

    public abstract void processRequest(PurchaseRequest request);


}
