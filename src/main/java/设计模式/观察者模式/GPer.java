package 设计模式.观察者模式;

import java.util.Observable;

public class GPer extends Observable{

    private String name = "GP 生态圈";
    private static final GPer gPer = new GPer();

    private GPer() {
    }

    public String getName() {
        return name;
    }

    public static GPer getInstance(){
        return gPer;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在gp社区" + this.name + "提了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
