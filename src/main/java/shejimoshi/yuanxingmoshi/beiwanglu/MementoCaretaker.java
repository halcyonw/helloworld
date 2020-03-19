package shejimoshi.yuanxingmoshi.beiwanglu;

public class MementoCaretaker {
    private Chessman chessman;

    public MementoCaretaker() {
    }

    public MementoCaretaker(Chessman chessman) {
        this.chessman = chessman;
    }

    public Chessman getChessman() {
        return chessman;
    }

    public void setChessman(Chessman chessman) {
        this.chessman = chessman;
    }
}
