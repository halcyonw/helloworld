package shejimoshi.xiangyuanmoshi.bianjiqi;

public abstract class Shipin {
    protected abstract String getName();

    public void display(WeizhiDaxiao weizhiDaxiao) {
        System.out.println("视频名字" + this.getName() + "视频大小" + weizhiDaxiao.getSize() + "视频位置" + weizhiDaxiao.getX() + weizhiDaxiao.getY());
    }

}
