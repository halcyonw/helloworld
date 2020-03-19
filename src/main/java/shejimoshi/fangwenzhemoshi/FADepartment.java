package shejimoshi.fangwenzhemoshi;

public class FADepartment extends  Department {
    @Override
    public void visit(FulltimeEmployee fulltimeEmployee) {
        int workTime=fulltimeEmployee.getWorkTime();
        double weekAge=fulltimeEmployee.getWeeklyAge();
        if (workTime > 40) {
            weekAge+=(workTime-40)*100;
        }else{
            weekAge-=(40-workTime)*80;
            if (weekAge < 0) {
                weekAge=0;
            }
        }
        System.out.println("正式员工"+fulltimeEmployee.getName()+"一周工资为："+weekAge);
    }

    @Override
    public void visit(ParttimeEmployee parttimeEmployee) {
        int workTime=parttimeEmployee.getWorkTime();
        double hourAge=parttimeEmployee.getHourAge();
        System.out.println("兼职员工" + parttimeEmployee.getName() + "一周工资为：" + hourAge * workTime);

    }
}
