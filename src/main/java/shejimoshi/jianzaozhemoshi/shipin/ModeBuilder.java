package shejimoshi.jianzaozhemoshi.shipin;

public  abstract class ModeBuilder  {
  protected   Screen screen = new Screen();

    public abstract void buildMenu();

    public abstract void buildPlayList();

  public abstract void buildWindow();

  public abstract void buildControlBar();

  public abstract void buildCollectList();
  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }
}
