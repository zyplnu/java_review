package 设计模式.访问者模式.Kpi;

import java.util.Random;

public class Engineer extends Employee {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(10*10000);
    }
}
