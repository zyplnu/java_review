package 设计模式.组合模式.安全模式;

public abstract class Directory {

    protected  String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
