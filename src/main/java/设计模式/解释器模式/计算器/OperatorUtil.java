package 设计模式.解释器模式.计算器;

public class OperatorUtil {

    public static boolean ifOperator(String symbol){
        return symbol.equals("+") || symbol.equals("-") || symbol.equals("*") || symbol.equals("/");
    }

    public static Interpreter getInterpreter(IArithmeticInterpret left , IArithmeticInterpret right , String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(left , right);
        } else if(symbol.equals("-")){
            return new SubInterpreter(left , right);
        } else {
            return null;
        }
    }
}
