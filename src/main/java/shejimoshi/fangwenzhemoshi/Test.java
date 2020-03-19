package shejimoshi.fangwenzhemoshi;

public class Test {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        Employee fte1,fte2,fte3,pte1,pte2;
        fte1 = new FulltimeEmployee("张无忌", 3200, 45);
        fte2 = new FulltimeEmployee("杨过", 2000, 40);
        pte1 = new ParttimeEmployee("洪七公", 80.0, 20);
        pte2 = new ParttimeEmployee("郭靖", 60.0, 18);
        employeeList.addEmployee(fte1);
        employeeList.addEmployee(fte2);
        employeeList.addEmployee(pte1);
        employeeList.addEmployee(pte2);
        Department department = (Department) XMLUtil.getBean();
        employeeList.accept2(department);
    }
}
