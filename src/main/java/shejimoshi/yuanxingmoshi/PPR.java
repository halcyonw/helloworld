package shejimoshi.yuanxingmoshi;

public class PPR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument ppr=null;

        try {
            ppr=(OfficialDocument)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
        }
        return ppr;
    }

    @Override
    public void display() {

    }
}
