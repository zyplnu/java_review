package 设计模式.访问者模式.Kpi;

import java.util.Random;

public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.visit(this);
    }

    public int getProducts(){
        return new Random().nextInt(10);
    }
}
