package 设计模式.工厂模式.抽象工厂;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createVideo().replay();
        factory.createNote().edit();

        CourseFactory factory1 = new PythonCourseFactory();
        factory1.createCourse().record();
        factory1.createVideo().replay();
        factory1.createNote().edit();
    }
}
