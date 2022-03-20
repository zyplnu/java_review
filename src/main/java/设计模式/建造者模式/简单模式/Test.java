package 设计模式.建造者模式.简单模式;

public class Test {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式");
        builder.addNote("笔记");

        System.out.println(builder.builder());
    }
}
