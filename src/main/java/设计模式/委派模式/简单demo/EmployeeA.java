package 设计模式.委派模式.简单demo;

public class EmployeeA implements IEmployee {

    protected String goodAt = "编程";

    @Override
    public void doing(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + ",开始做" + task);
    }
}
