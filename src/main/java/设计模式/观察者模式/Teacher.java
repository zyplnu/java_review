package 设计模式.观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object question) {
        GPer gPer = (GPer) observable;
        Question question1 = (Question) question;
        System.out.println(name + "老师，您好！\n，您收到了一个来自" + gPer.getName() +"问题内容：" + question1.getContent());
    }
}
