package shejimoshi.qiaojiemoshi;

public class Test {
    public static void main(String[] args) {
        Image image = (Image) XMLUtil.getBean("image");
        ImageImp imp = (ImageImp) XMLUtil.getBean("os");
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
