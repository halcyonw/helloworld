package shejimoshi.yuanxingmoshi;

import java.io.*;

public class Customer implements Cloneable, Serializable {
    private Address address;
    private String name;
    private int age;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    /*   public Customer clone() {
                Customer o=null;
            try {
                o = (Customer) super.clone();
                return o;
            } catch (CloneNotSupportedException e) {
                System.out.println("复制失败");
                return null;
            }

        }

     */
    public Customer clone() {
        Customer o=null;
        try {
            o=(Customer)super.clone();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
       o.address=address.clone();
        return o;

    }
    public Customer deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Customer) ois.readObject();
    }
}
