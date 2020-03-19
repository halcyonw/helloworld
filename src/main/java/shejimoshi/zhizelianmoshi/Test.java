package shejimoshi.zhizelianmoshi;

public class Test {
    public static void main(String[] args) {
        Approver zhang,yang,guo,dong,huang;
        zhang = new Director("张无忌");
        yang = new VicePresident("杨过");
        guo = new President("郭靖");
        dong = new Congress("董事会");
        huang = new Manager("黄蓉");
        //创建职责链
        zhang.setSuccessor(huang);
        huang.setSuccessor(yang);
        yang.setSuccessor(guo);
        guo.setSuccessor(dong);
        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(1000, 10001, "购买倚天剑");
        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买屠龙刀");
        PurchaseRequest pr3 = new PurchaseRequest(16000, 10003, "购买葵花宝典");
        PurchaseRequest pr4= new PurchaseRequest(8088000, 10004, "购买桃花岛");
        zhang.processRequest(pr1);
        zhang.processRequest(pr2);
        zhang.processRequest(pr3);
        zhang.processRequest(pr4);
    }
}
