package shejimoshi.jianzaozhemoshi.shipin;

public class Test {
    public static void main(String[] args) {
        ModeBuilder ModeBuilder = (ModeBuilder)XMLUtil.getBean();


        ScreenModeController screenModeController = new ScreenModeController(ModeBuilder);
       Screen contruct = screenModeController.contruct();
        System.out.println(contruct.getCollectList()+contruct.getControlBar()+contruct.getMenu()+contruct.getPlayList()+contruct.getWindow());
    }
}
