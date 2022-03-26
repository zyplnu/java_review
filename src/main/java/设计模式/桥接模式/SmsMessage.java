package 设计模式.桥接模式;

public class SmsMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信消息发送" + message + "给" + toUser);
    }
}
