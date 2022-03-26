package 设计模式.桥接模式;

public abstract class AbstractMessage {
    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }

    void sendMessage(String message , String toUser){
       this.message.send(message , toUser);
    }
}
