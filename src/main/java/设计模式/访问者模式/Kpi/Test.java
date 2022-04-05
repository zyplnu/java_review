package 设计模式.访问者模式.Kpi;

public class Test {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("----------ceo看报表---------------");
        report.showReport(new CEOVistor());

        System.out.println("----------cto看报表---------------");
        report.showReport(new CTOVistor());
    }
}
