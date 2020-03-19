package nimingneibulei;

public class InnerDemo3 {
    public static void main(String[] args) {
     showFly(   new FlyAble(){

            @Override
            public void fly() {

            }
        });
    }

    public static void showFly(FlyAble flyAble) {
        flyAble.fly();
    }
}
