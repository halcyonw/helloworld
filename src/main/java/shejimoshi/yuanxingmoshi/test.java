package shejimoshi.yuanxingmoshi;

import java.io.IOException;

public class test {
    public static void main(String[] args) {

        Customer c_Previous = new Customer();
        Address address = new Address();
        address.setDizhi("杭州");
        c_Previous.setAge(18);
        c_Previous.setName("周彬彬");
        c_Previous.setAddress(address);

        Customer c_new = null;
    /*   try {
            c_new = c_Previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
        //    Customer c_new =  CloneUtil.cloneObject(c_Previous);
  // c_new=c_Previous.clone();
        c_new = CloneUtil.cloneObject(c_Previous);
        address.setDizhi("北京");
        System.out.println("f"+c_new.getAddress().getDizhi() + c_new.getAge() + c_new.getName());
        System.out.println("f"+c_Previous.getAddress().getDizhi() + c_Previous.getAge() + c_Previous.getName());


    }
}
