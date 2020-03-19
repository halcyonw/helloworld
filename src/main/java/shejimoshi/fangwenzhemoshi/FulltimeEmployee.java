package shejimoshi.fangwenzhemoshi;

public class FulltimeEmployee implements  Employee{
    private String name;
    private double weeklyAge;
    private int workTime;

    public FulltimeEmployee() {
    }

    public FulltimeEmployee(String name, double weeklyAge, int workTime) {
        this.name = name;
        this.weeklyAge = weeklyAge;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeeklyAge() {
        return weeklyAge;
    }

    public void setWeeklyAge(double weeklyAge) {
        this.weeklyAge = weeklyAge;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handler) {
        handler.visit(this);
    }
}