package shejimoshi.jianzaozhemoshi.game;

public class Test {
    public static void main(String[] args) {

        ActorBuilder a =(ActorBuilder) XMLutil.getBean();
        Controller controller = new Controller();
        Actor actor = controller.construct(a);

       System.out.println(actor.getType()+ "的外观：");
System.out.println("性别：" + actor.getSex());

 System.out.println("面容：" + actor.getFace());

System.out.println("服装：" + actor.getCostume());

System.out.println("发型：" + actor.getHairstyle());

    }
}
