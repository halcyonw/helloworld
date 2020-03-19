package shejimoshi.jianzaozhemoshi.shipin;

public class Screen {
    private String menu;
    private String playList;
    private String window;
    private String controlBar;
    private String collectList;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    public Screen(String menu, String playList, String window, String controlBar, String collectList) {
        this.menu = menu;
        this.playList = playList;
        this.window = window;
        this.controlBar = controlBar;
        this.collectList = collectList;
    }

    public Screen() {
    }
}
