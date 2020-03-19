package shejimoshi.fangwenzhemoshi.jiangli;

public class Teacher implements Occupotion {
    private String name;
    private int paperNumber;
    private int teachScore;

    public Teacher(String name, int paperNumber, int teachScore) {
        this.name = name;
        this.paperNumber = paperNumber;
        this.teachScore = teachScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(int paperNumber) {
        this.paperNumber = paperNumber;
    }

    public int getTeachScore() {
        return teachScore;
    }

    public void setTeachScore(int teachScore) {
        this.teachScore = teachScore;
    }

    @Override
    public void accept(Award award) {
        award.visit(this);
    }
}
