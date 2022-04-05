package 设计模式.解释器模式.计算器;

public class AddInterpreter extends Interpreter {

    public AddInterpreter(IArithmeticInterpret left, IArithmeticInterpret right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}
