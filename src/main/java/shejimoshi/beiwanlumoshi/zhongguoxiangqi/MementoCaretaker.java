package shejimoshi.beiwanlumoshi.zhongguoxiangqi;

import java.util.ArrayList;

public class MementoCaretaker {

    private ArrayList mementolist = new ArrayList();

    public Chessman.ChessmanMemento getMemento(int i) {
        return (Chessman.ChessmanMemento) mementolist.get(i);
    }

    public void setMemento(Chessman.ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
