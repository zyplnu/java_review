package 设计模式.建造者模式.简单模式;

public class CourseBuilder {

    private Course course = new Course();

    public void addName(String name){
        course.setName(name);
    }

    public void addHomework(String homework){
        course.setHomework(homework);
    }

    public void addPPT(String ppt){
        course.setPpt(ppt);
    }

    public void addVideo(String video){
        course.setVideo(video);
    }

    public void addNote(String note){
        course.setNote(note);
    }

    public Course builder(){
        return course;
    }

}
