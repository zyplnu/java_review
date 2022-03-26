package 设计模式.委派模式.简单demo;

public class EmployeeB implements IEmployee {
    protected String goodAt = "平面设计";

    @Override
    public void doing(String task) {
        System.out.println("我是员工B，我擅长" + goodAt + ",开始做" + task);
    }
}
