package 设计模式.建造者模式.链式模式;

public class CourseTest {
    private int age;
    private int color;

    @Override
    public String toString() {
        return "CourseTest{" +
                "age=" + age +
                ", color=" + color +
                '}';
    }

    public static class Builder{
       private CourseTest course = new CourseTest();

       public Builder addAge(int age){
           course.age = age;
           return this;
       }

       public Builder addColor(int color){
           course.color = color;
           return this;
       }

       public CourseTest build(){
           return course;
       }

    }

    public static void main(String[] args) {
        CourseTest builder = new CourseTest.Builder().addAge(1).addColor(2).build();
        System.out.println(builder);
    }
}
