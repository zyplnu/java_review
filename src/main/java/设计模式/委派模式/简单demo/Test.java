package 设计模式.委派模式.简单demo;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("爬虫" , new Leader());
    }
}
