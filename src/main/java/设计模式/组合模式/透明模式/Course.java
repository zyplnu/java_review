package 设计模式.组合模式.透明模式;

public class Course extends CourseComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(CourseComponent component) {
        return this.name;
    }

    public double getPrice(CourseComponent component) {
        return this.price;
    }
}
