package shejimoshi.qiaojiemoshi;

public class PNGImage extends Image {
    public PNGImage(ImageImp imp) {
        super(imp);
    }

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName+",格式为PNG");

    }
}
