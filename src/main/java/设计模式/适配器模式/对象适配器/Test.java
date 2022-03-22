package 设计模式.适配器模式.对象适配器;

public class Test {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        System.out.println(adapter.output5V());
    }
}
