package shejimoshi.fangwenzhemoshi;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void removeEmployee(Employee employee) {
        list.remove(employee);
    }

    public void accept2(Department handler) {
        for (Employee obj:list
             ) {
            obj.accept(handler);
        }
    }
}
