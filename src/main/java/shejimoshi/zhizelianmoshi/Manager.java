package shejimoshi.zhizelianmoshi;

public class Manager extends Approver {
    public Manager(Approver successor) {
        super(successor);
    }

    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 80000) {
            System.out.println("经理"+this.name+request.getNumber() + ",金额" + request.getAmount() + "元，采购目的" + request.getPurpose());
        }else{
            this.successor.processRequest(request);
        }
    }
}
