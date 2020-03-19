
package shejimoshi.jianzaozhemoshi.game;

public class Controller {
    private ActorBuilder ab;



    public ActorBuilder getAb() {
        return ab;
    }

    public void setAb(ActorBuilder ab) {
        this.ab = ab;
    }

    public Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        return ab.createActor();
    }

}

