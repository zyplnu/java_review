package 设计模式.工厂模式.抽象工厂;

public class JavaCourseFactory extends CourseFactory {

    public void init(){
        super.init();
    }

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }


}
