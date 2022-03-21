package 设计模式.享元模式.抢票;

public class Test {
    public static void main(String[] args) {
        ITicket ticket = TicketFactory.queryTicket("北京西","长沙");
        ticket.showInfo("硬座");

        ticket = TicketFactory.queryTicket("北京西","长沙");
        ticket.showInfo("软座");
    }
}
