package shejimoshi.jianzaozhemoshi.game;

public abstract class ActorBuilder {

protected    Actor actor=new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

 //钩子方法
    public boolean isBareheaded() {
        return false;
    }

/*public Actor construct() {
        this.buildType();
        this.buildSex();
        this.buildFace();
        this.buildCostume();
        this.buildHairstyle();
        return actor;
    }*/
  public Actor createActor() {
        return actor;
    }
}
