package 设计模式.解释器模式.计算器;

public class Test {
    public static void main(String[] args) {
        System.out.println(new GPCalculator("10 + 30").calcuate());
//        System.out.println(new GPCalculator("10 * 2 + 40 * 2 + 30").calcuate());
    }
}
