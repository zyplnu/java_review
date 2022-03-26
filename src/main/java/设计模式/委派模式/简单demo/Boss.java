package 设计模式.委派模式.简单demo;

public class Boss {
    public void command(String task , Leader leader){
        leader.doing(task);
    }
}
