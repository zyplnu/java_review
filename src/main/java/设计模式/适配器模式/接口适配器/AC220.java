package 设计模式.适配器模式.接口适配器;

public class AC220 {
    public int outputAC220(){
        int output = 220;
        System.out.println("输出电压："+220 + "V");
        return output;
    }
}
