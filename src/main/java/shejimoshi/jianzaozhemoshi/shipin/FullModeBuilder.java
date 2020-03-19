package shejimoshi.jianzaozhemoshi.shipin;

public class FullModeBuilder extends ModeBuilder {
    @Override
    public void buildMenu() {
        screen.setMenu("菜单");
    }

    @Override
    public void buildPlayList() {
        screen.setPlayList("播放列表");
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

    }


}
