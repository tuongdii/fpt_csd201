
package stacks;

import java.util.Stack;

public class Converter {
    public static String converter(int n, int base){
        String result="";
        Stack<Integer> stk = new Stack();
        do{
            stk.push(n%base);
            n /= base;
        }while(n>0);
        
        while(!stk.empty()){
            int value = stk.pop();
            result +=Character.forDigit(value, base);
        }
        return result;    
    }
    public static void main(String[] args) {
        int n = 2012;
        System.out.println(converter(n, 2) + "b");
        System.out.println(converter(n, 8) + "q");
        System.out.println(converter(n, 10) + "d");
        System.out.println(converter(n, 16) + "h");
    }
}
