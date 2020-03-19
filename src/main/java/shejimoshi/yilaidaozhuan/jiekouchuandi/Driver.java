package shejimoshi.yilaidaozhuan.jiekouchuandi;

public class Driver implements  IDriver {

    @Override
    public void drive(Icar icar) {
        icar.run();
    }



/*    private Icar car;
    public Driver(Icar car) {
        this.car=car;
    }
    public void drive() {
        this.car.run();
    }*/


   /* public void setCar(Icar car) {
        this.car=car;
    }*/
}
