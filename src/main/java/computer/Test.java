package computer;

public class Test {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        l.run();



        Usb u=new Mouse();

        l.useUSB(u);

        Usb kb=new KeyBoard();
        l.useUSB(kb);

        l.shutDown();
    }
}
