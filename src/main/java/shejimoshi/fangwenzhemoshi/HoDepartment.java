package shejimoshi.fangwenzhemoshi;

public class HoDepartment extends  Department {
    @Override
    public void visit(FulltimeEmployee fulltimeEmployee) {
       int workTime=fulltimeEmployee.getWorkTime();
        System.out.println("员工" + fulltimeEmployee.getName() + "工作时间" + workTime);
        if (workTime > 40) {

            System.out.println("员工"+fulltimeEmployee.getName()+"加班时间"+(workTime-40));
        }else {
            System.out.println("员工"+fulltimeEmployee.getName()+"请假时间"+(40-workTime));
        }
    }

    @Override
    public void visit(ParttimeEmployee parttimeEmployee) {
        int workTime=parttimeEmployee.getWorkTime();
        System.out.println("员工"+parttimeEmployee+"工作时间"+workTime);
    }
}
