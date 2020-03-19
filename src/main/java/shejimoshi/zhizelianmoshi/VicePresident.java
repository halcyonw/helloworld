package shejimoshi.zhizelianmoshi;

public class VicePresident extends Approver {
    public VicePresident(Approver successor) {
        super(successor);
    }

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长"+this.name+"审批采购"+request.getNumber() + ",金额" + request.getAmount() + "元，采购目的" + request.getPurpose());
        }else {
            this.successor.processRequest(request);
        }
    }
}
