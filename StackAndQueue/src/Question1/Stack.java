package Question1;


import java.util.EmptyStackException;
import java.util.Scanner;


public class Stack {
  private int arr[];
  private int top;
  private int capacity;
  Stack(int size) {
    arr = new int[size];
    capacity = size;
    top = -1;
  }
    public Boolean isEmpty() {
        return top == -1;
    }
    public void clear(){
        top = -1;
    }
    public void push(int x) {
        if (isFull()) {
          System.out.println("Stack OverFlow");
          System.exit(1);
        }
        arr[++top] = x;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();    
        }
        return arr[top--];
    }
      public int top(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else
            return arr[top];
          }        
    public int getSize() {
        return top + 1;
    }
    public Boolean isFull() {
        return top == capacity - 1;
      }

    public void traverse() {  
        if (isEmpty())
            System.out.println("List is empty");
        for (int i = 0; i <= top; i++) {
          System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int n = Integer.parseInt(sc.nextLine());
        String result="";
        Stack stk = new Stack(10);
        do{
            stk.push(n%2);
            n /= 2;
        }while(n>0);
        
        while(!stk.isEmpty()){
            int value = stk.pop();
            result +=Character.forDigit(value, 2);
        }
        System.out.println("Number after conversion: " + result);
    }
}
