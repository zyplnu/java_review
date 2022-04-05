package 设计模式.解释器模式.计算器;

/**
 * 终结表达式
 */
public class NumInterpreter implements IArithmeticInterpret {

    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
