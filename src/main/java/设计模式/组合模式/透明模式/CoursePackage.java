package 设计模式.组合模式.透明模式;

import java.util.ArrayList;
import java.util.List;

public class CoursePackage extends CourseComponent {

    private List<CourseComponent> items = new ArrayList<>();

    private String name;
    private Integer level;
    private double price;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(CourseComponent courseComponent) {
        items.add(courseComponent);
    }

    @Override
    public void removeChild(CourseComponent courseComponent) {
        items.remove(courseComponent);
    }

    @Override
    public String getName(CourseComponent courseComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CourseComponent courseComponent) {
        return this.price;
    }
}
