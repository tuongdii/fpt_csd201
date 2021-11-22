/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recureliminatedemo;

import java.util.Stack;

/**
 *
 * @author User
 */
public class RecurEliminateDemo {

    public static String curConvert(int n, int base) {
        if (n == 0) {
            return "0";
        }
        return curConvert(n / base, base) + Character.forDigit(n % base, base);
    }

    public static String loopConvert(int n, int base) {
        String result = "";
        do {
            result = Character.forDigit(n % base, base) + result;
            n /= base;
        } while (n > 0);
        return result;
    }

    public static String stackConvert(int n, int base) {
        Stack<Character> st = new Stack();
        do {
            st.push(Character.forDigit(n % base, base));
            n /= base;
        } while (n > 0);
        String result = "";
        while (!st.isEmpty()) {
            result += st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Recursion: ");
        System.out.println("10 base: " + curConvert(122, 10));
        System.out.println("2 base: " + curConvert(122, 2));
        System.out.println("8 base: " + curConvert(122, 8));
        System.out.println("16 base: " + curConvert(122, 16));
        System.out.println("Loop: ");
        System.out.println("2 base: " + loopConvert(122, 16));
        System.out.println("Stack: ");
        System.out.println("2 base: " + stackConvert(122, 16));

    }
}
