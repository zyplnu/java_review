package 设计模式.工厂模式.抽象工厂;

public abstract class CourseFactory {

    public void init(){
        System.out.println("初始化");
    }

    public abstract ICourse createCourse();

    public abstract IVideo createVideo();

    public abstract INote createNote();

}
