package 设计模式.建造者模式.链式模式;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式").addNote("笔记");

        System.out.println(builder.builder());
    }
}
