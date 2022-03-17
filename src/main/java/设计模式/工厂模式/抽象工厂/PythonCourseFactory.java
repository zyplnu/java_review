package 设计模式.工厂模式.抽象工厂;

public class PythonCourseFactory extends CourseFactory {

    public void init(){
        super.init();
    }

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }


}
