package 设计模式.观察者模式;

public class Test {
    public static void main(String[] args) {
        GPer gPer = GPer.getInstance();
        Teacher teacher = new Teacher("tom");

        gPer.addObserver(teacher);

        Question question = new Question();
        question.setContent("123");
        question.setUserName("zhagnsan");

        gPer.publishQuestion(question);

//        teacher.
    }
}
