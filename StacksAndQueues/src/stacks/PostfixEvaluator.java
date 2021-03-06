
package stacks;

import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixEvaluator {
    public static boolean isOperator(String S){
        return (S.equals("+")||S.equals("-")||S.equals("*")||S.equals("/"));
    }
    public static double evaluate(String op, double n1, double n2){
        switch(op){
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            case "/":
                if(n2==0) throw new RuntimeException("Divide by 0!");
                return n1 / n2;
        }
        return 0.0;
    }
    public static double evaluate(String exp){
        double result = 0;
        StringTokenizer stk = new StringTokenizer(exp, " ");
        Stack<Double> stack = new Stack();
        double n1, n2;
        while(stk.hasMoreElements()){
            String part = stk.nextToken();
            if(!isOperator(part))
                stack.push(Double.parseDouble(part));
            else{
                n1 = stack.pop();
                n2 = stack.pop();
                result = evaluate(part, n1, n2);
                stack.push(result);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String exp = "3 4 * 5 6 * + 3 *";
        System.out.println(evaluate(exp));
    }
}
