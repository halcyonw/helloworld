package shejimoshi.fangwenzhemoshi;

public class ParttimeEmployee implements Employee {
    private String name;
    private Double hourAge;
    private int workTime;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(String name, Double hourAge, int workTime) {
        this.name = name;
        this.hourAge = hourAge;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourAge() {
        return hourAge;
    }

    public void setHourAge(Double hourAge) {
        this.hourAge = hourAge;
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
