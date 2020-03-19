package shejimoshi.fangwenzhemoshi.jiangli;

public class Student implements Occupotion{
    private String name;
    private int averageScore;
    private int paperNumber;

    public Student() {
    }

    public Student(String name, int averageScore, int paperNumber) {
        this.name = name;
        this.averageScore = averageScore;
        this.paperNumber = paperNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getPaperNumber() {
        return paperNumber;
    }

    public void setPaperNumber(int paperNumber) {
        this.paperNumber = paperNumber;
    }

    @Override
    public void accept(Award award) {
        award.visit(this);
    }
}
