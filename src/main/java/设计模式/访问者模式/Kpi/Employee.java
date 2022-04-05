package 设计模式.访问者模式.Kpi;

import java.util.Random;

public abstract class Employee {
    public String name;
    public int kpi;

    public Employee(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(IVistor vistor);
}
