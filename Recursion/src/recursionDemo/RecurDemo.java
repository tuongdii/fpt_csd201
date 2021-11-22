/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionDemo;

/**
 *
 * @author DELL
 */
public class RecurDemo {
    public static double factorial(int n){
        if(n<2) return 1;
        return n*factorial(n-1);
    }
    public static int fibo(int n){
        if(n<2) return 1;
        return fibo(n-2) + fibo(n-1);
    }
    public static boolean testFibo(int x){
        if(x<1) return false;
        int aFibo = 1;
        int n = 2;
        while(aFibo<x) aFibo = fibo(n++);
        return x == aFibo;
    }
    public static double ap(int n, double a, double d){
        if(n==1) return a;
        return ap(n-1, a, d) + d;
    }
    public static double qp(int n, double a, double q){
        if(n==1) return a;
        return qp(n-1, a, q)*q;
    }
    public static double sum(double[]a, int n){
        if(n==0) return 0;
        return sum(a,n-1)+a[n-1];
    }
    public static double max(double[]a, int n){
        if(n==1) return a[0];
        double m = max(a, n-1);
        return m>a[n-1] ? m : a[n-1]; 
    }
    public static double min(double[]a, int n){
        if(n==1) return a[0];
        double m = min(a, n-1);
        return m<a[n-1] ? m : a[n-1]; 
    }
    public static String convert(int n, int base){
        if(n==0) return "0";
        return convert(n/base, base) + Character.forDigit(n%base, base);
    }
    public static void t(int n){
        if(n==0)
            System.out.println("That's all!");
        else{
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
                System.out.println();
                t(n-1);
            }
        }
    }
    public static void main(String[] args) {
        //System.out.println("test" + t(5));
        t(3);
        System.out.println("1. Calculate factorial: ");
        System.out.println(factorial(1));
        System.out.println();
        System.out.println("2. Testing whether an element belongs to a set: ");
        System.out.println(testFibo(55));
        System.out.println(testFibo(144));
        System.out.println(testFibo(120));
        System.out.println();
        System.out.println("3. Compute the 6th item of an arithmetic progression having the first item 1.5 and common difference 2:");
        System.out.println(ap(6,1.5,2));
        System.out.println();
        System.out.println("4. Compute the 6th item of a geometric progression having the first item 1.5 and common multiplier 2: ");
        System.out.println(qp(6,1.5,2));
        System.out.println();
        System.out.println("5. Calculate sum of integral array having 6 elements: ");
        double a[] = {1.5, 2, 4, 5, 2, 6.5};
        System.out.println(sum(a,6));
        System.out.println();
        System.out.println("6. Calculate the maximum value in an integral array having n elements");
        double b[] = {1, 5, 9, 7, 2, 19, 10};
        System.out.println(max(b,7)); 
        System.out.println("7. Calculate the minimum value in an integral array having n elements:");
        System.out.println(min(b,7));
        System.out.println("Binary: " + convert(266, 2));
        System.out.println("Decimal: " + convert(266, 10));
        System.out.println("Octal: " + convert(266, 8));
        System.out.println("Hexadecimal: " + convert(266, 16));
    }
}
