package shejimoshi.qiaojiemoshi.shujuzhuanghuan;

public class Test {
    public static void main(String[] args) {
       Format format = (Format) XMLUtil.getBean("database");
      Geshi geshi = (Geshi) XMLUtil.getBean("geshi");
        geshi.setFormat(format);
        geshi.parseDatabase("数据库中的数据");
    }
}
