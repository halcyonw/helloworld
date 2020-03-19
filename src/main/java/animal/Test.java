package animal;

public class Test {


    public static void main(String[] args) {
        Animal c = new Cat();
        Animal d = new Dog();

        AnimalEat( c);
        AnimalEat(d);
    }

    private static void AnimalEat(Animal a) {
        a.eat();
    }


}
