package shejimoshi.qiaojiemoshi;

public abstract class Image {
    protected  ImageImp imp;

    public Image() {
    }

    public Image(ImageImp imp) {
        this.imp = imp;
    }

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
