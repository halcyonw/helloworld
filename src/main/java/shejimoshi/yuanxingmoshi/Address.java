package shejimoshi.yuanxingmoshi;

import java.io.Serializable;

public class Address implements Cloneable,Serializable {
    private String dizhi;

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    public Address clone() {
        Address a =null;
        try {
            a = (Address) super.clone();
            return a;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }

    }
}
