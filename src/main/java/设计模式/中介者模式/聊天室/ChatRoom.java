package 设计模式.中介者模式.聊天室;

public class ChatRoom {

    public void showMsg(User user , String msg){
        System.out.println("["+ user +"]" + msg);
    }
}
