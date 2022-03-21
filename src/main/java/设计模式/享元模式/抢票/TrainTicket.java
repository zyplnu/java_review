package 设计模式.享元模式.抢票;

import java.util.Random;

public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
         this.price = new Random().nextInt(500);
        System.out.println(from + "->" + to + bunk + + price);
    }
}
