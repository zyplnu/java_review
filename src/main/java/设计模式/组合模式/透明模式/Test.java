package 设计模式.组合模式.透明模式;

public class Test {
    public static void main(String[] args) {
        CourseComponent java = new Course("java" , 90);
        CourseComponent ai = new Course("ai" , 90);

        CourseComponent pack = new CoursePackage("java" , 2);
        pack.addChild(java);
        pack.addChild(ai);


    }
}
