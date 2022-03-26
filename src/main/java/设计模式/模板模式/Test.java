package 设计模式.模板模式;

public class Test {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.setNeedCheckHomework(false);
        javaCourse.createCourse();

        System.out.println("------------------");

        PythonCourse pythonCourse = new PythonCourse();
        pythonCourse.createCourse();
    }
}
