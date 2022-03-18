package 设计模式.原型模式.浅拷贝;

public class Client {
    public Prototype startClone(Prototype prototype){
        return prototype.clone();
    }
}
