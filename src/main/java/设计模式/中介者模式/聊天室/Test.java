package 设计模式.中介者模式.聊天室;

public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User tom = new User("tom",chatRoom);
        User jerry = new User("jerry",chatRoom);
        tom.sendMsg("hi");
        jerry.sendMsg("hello");
    }
}
