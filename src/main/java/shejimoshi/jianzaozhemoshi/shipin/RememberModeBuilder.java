package shejimoshi.jianzaozhemoshi.shipin;

public class RememberModeBuilder extends ModeBuilder {
    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlayList() {

    }

    @Override
    public void buildWindow() {
        screen.setWindow("主窗口");
    }

    @Override
    public void buildControlBar() {
        screen.setControlBar("控制条");
    }

    @Override
    public void buildCollectList() {
        screen.setCollectList("收藏列表");
    }
}
