package 设计模式.模板模式;

public class PythonCourse extends AbstractCourse {

    @Override
    protected boolean needCheckHomework() {
        return true;
    }

    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
