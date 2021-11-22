
package stacks;

import java.util.Stack;
import java.util.StringTokenizer;

public class PrefixEvaluator {
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
    public static String reverse(String exp){
        StringBuilder newExp = new StringBuilder(exp);
        return newExp.reverse().toString();
    }
    public static double evaluate(String exp){
        double result = 0;
        StringTokenizer stk = new StringTokenizer(reverse(exp), " ");
        Stack<Double> stack = new Stack();
        double n1, n2;
        while(stk.hasMoreElements()){
            String part = reverse(stk.nextToken());
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
       String exp = "- / * 20 * 50 + 3 6 300 2";
       System.out.println(evaluate(exp));
    }
}
