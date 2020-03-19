package shejimoshi.qiaojiemoshi.shujuzhuanghuan;

abstract class Geshi {
protected Format format;

    public Geshi() {
    }

    public Geshi(Format format) {
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public abstract void parseDatabase(String database);

}
