package 设计模式.工厂模式.简单工厂;

public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = CourseFactory.create(JavaCourse.class);
        ICourse pythonCourse = CourseFactory.create(PythonCourse.class);
        javaCourse.record();
        pythonCourse.record();
    }
}
