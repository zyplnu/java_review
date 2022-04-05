package 设计模式.访问者模式.Kpi;

public interface IVistor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
