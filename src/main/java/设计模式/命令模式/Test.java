package 设计模式.命令模式;

import 设计模式.原型模式.浅拷贝.ConcretePrototypeA;

public class Test {
    public static void main(String[] args) {
        GPlayer player = new GPlayer();

        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        PauseAction pauseAction = new PauseAction(player);
        PlayAction playAction = new PlayAction(player);
        controller.addAction(pauseAction);
        controller.addAction(playAction);
        controller.executes();
    }
}
