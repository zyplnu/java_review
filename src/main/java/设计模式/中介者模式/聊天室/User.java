package 设计模式.中介者模式.聊天室;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name ;
    }

    public void sendMsg(String msg){
        this.chatRoom.showMsg(this,msg);
    }
}
