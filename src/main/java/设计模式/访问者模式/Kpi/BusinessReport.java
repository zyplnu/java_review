package 设计模式.访问者模式.Kpi;

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {

    private List<Employee> employees = new ArrayList<>();

    public BusinessReport() {
        employees.add(new Manager("产品经理A"));
        employees.add(new Manager("产品经理B"));
        employees.add(new Engineer("程序员A"));
        employees.add(new Manager("程序员B"));
    }

    public void showReport(IVistor vistor){
        for (Employee employee : employees) {
            employee.accept(vistor);
        }
    }

}
