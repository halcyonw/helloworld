package shejimoshi.qiaojiemoshi;

public class GIFImage extends Image {
    public GIFImage(ImageImp imp) {
        super(imp);
    }

    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imp.doPaint(matrix);
        System.out.println(fileName+",格斯为BMP");
    }
}
