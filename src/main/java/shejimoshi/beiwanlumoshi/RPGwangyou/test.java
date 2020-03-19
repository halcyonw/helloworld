package shejimoshi.beiwanlumoshi.RPGwangyou;

public class test {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();
        jindu j = new jindu("小黑", 1);
        display(j);
        mementoCaretaker.setJinduMemento(j.save());
        j.setPass(2);
        display(j);
        System.out.println("复活");
        j.restore(mementoCaretaker.getJinduMemento());
        display(j);
    }

    private static void display(jindu j) {
        System.out.println(j.getName()+"当前 位置,第"+j.getPass()+"关");
    }
}
