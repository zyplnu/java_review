package 设计模式.访问者模式.Kpi;

public class CEOVistor implements IVistor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师" + engineer.name + "KPI" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理" + manager.name + "KPI" + manager.kpi);
    }
}
