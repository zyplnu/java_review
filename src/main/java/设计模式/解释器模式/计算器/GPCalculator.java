package 设计模式.解释器模式.计算器;

import java.util.Stack;

public class GPCalculator {

    private Stack<IArithmeticInterpret> stack = new Stack<>();

    public GPCalculator(String expression) {
        parse(expression);
    }

    // 10 + 30
    private void parse(String expression) {
        String[] elements = expression.split(" ");
        IArithmeticInterpret left,right;

        for (int i = 0; i < elements.length; i++) {
            String operator = elements[i];
            if(OperatorUtil.ifOperator(operator)){
                left = this.stack.pop();
                right = new NumInterpreter(Integer.valueOf(elements[++i]));
                this.stack.push(OperatorUtil.getInterpreter(left , right , operator));
            } else {
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(elements[i]));
                this.stack.push(numInterpreter);
            }
        }
    }

    public int calcuate(){
        return stack.pop().interpret();
    }


}
