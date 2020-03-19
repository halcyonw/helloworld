package shejimoshi.jianzaozhemoshi.shipin;

public class ScreenModeController {
    private ModeBuilder modeBuilder;

    public ScreenModeController(ModeBuilder modeBuilder) {
        this.modeBuilder = modeBuilder;
    }

    public Screen contruct() {
        modeBuilder.buildCollectList();
        modeBuilder.buildControlBar();
        modeBuilder.buildMenu();
        modeBuilder.buildPlayList();
        modeBuilder.buildWindow();
        return modeBuilder.screen;
    }
}
