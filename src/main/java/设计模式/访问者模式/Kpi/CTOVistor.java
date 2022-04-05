package 设计模式.访问者模式.Kpi;

public class CTOVistor implements IVistor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师" + engineer.name + "代码行数" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理" + manager.name + "产品数" + manager.getProducts());
    }
}
