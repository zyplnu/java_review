package 设计模式.责任链模式;

public abstract class Handler {

    protected Handler next;

    public void next(Handler next){
        this.next = next;
    }

    public abstract void doHandler(Member member);

}
