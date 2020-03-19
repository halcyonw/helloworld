package shejimoshi.qiaojiemoshi;

public class BMPImage extends Image {
    public BMPImage(ImageImp imp) {
        super(imp);
    }

    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
     //   imp.doPaint(matrix);
        System.out.println(fileName+",格式为BMP");
    }
}
