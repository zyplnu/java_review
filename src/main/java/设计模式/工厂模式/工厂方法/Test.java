package 设计模式.工厂模式.工厂方法;

public class Test {
    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory();
        ICourse iCourse = javaFactory.create();
        iCourse.record();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse iCourse1 = pythonFactory.create();
        iCourse1.record();
    }
}
