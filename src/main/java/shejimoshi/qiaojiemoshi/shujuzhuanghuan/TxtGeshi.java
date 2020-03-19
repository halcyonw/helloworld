package shejimoshi.qiaojiemoshi.shujuzhuanghuan;

public class TxtGeshi extends Geshi {

    public TxtGeshi(Format format) {
        super(format);
    }

    @Override
    public void parseDatabase(String database) {
        Base b = new Base();
        format.format(b);
        System.out.println(database+"转换为txt");
    }


}
