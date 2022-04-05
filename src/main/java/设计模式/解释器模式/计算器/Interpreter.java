package 设计模式.解释器模式.计算器;

/**
 * 终结表达式
 */
public abstract class Interpreter implements IArithmeticInterpret {

    protected IArithmeticInterpret left;
    protected IArithmeticInterpret right;

    public Interpreter(IArithmeticInterpret left, IArithmeticInterpret right) {
        this.left = left;
        this.right = right;
    }
}
