package shejimoshi.yuanxingmoshi.beiwanglu;

public class test {
    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 1, 1);
        MementoCaretaker mementoCaretaker = new MementoCaretaker();

        display(chessman);
        Chessman memento = chessman.createMemento();
        chessman.setX(5);
        display(chessman);
        chessman.restoryChessMemento(memento);
        display(chessman);
    }
    private static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "第" + chess.getX() + "行，第" + chess.getY() + "列");
    }
}
