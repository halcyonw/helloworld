package shejimoshi.qiaojiemoshi;

public class JPGImage extends Image {
    public JPGImage(ImageImp imp) {
        super(imp);
    }

    public JPGImage() {
    }

    @Override
    public void parseFile(String fileName) {
        Matrix m=new Matrix();
       imp.doPaint(m);
        System.out.println(fileName+",格式为jpg");
    }
}
