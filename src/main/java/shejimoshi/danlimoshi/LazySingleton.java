package shejimoshi.danlimoshi;

public class LazySingleton {
    private volatile static LazySingleton instance=null;

    private LazySingleton() {

    }

     public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {

                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }
}
