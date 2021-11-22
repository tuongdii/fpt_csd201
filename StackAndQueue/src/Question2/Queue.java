package Question2;


import java.util.Scanner;


class Queue {
    private int[] arr;      
    private int front;      
    private int rear;       
    private int capacity;   
    private int count;      
 
    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    public int dequeue()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        int tmp = arr[front];
        front = (front + 1) % capacity;
        count--;
        return tmp;
    }

    public void enqueue(int item)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(1);
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    public int first()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }
    public int size() {
        return count;
    }
    public Boolean isEmpty() {
        return (size() == 0);
    }

    public Boolean isFull() {
        return (size() == capacity);
    }
    public void traverse() {  
        if (isEmpty())
            System.out.println("List is empty");
        for (int i = front; i <= rear ; i++) {
          System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int n = Integer.parseInt(sc.nextLine());
        String result="";
        Queue q = new Queue(10);
        do{
            q.enqueue(n%2);
            n /= 2;
        }while(n>0);
        
        while(!q.isEmpty()){
            int value = q.dequeue();
            result +=Character.forDigit(value, 2);
        }
        StringBuilder newResult = new StringBuilder(result);
        newResult.reverse();
        System.out.println("Number after conversion: " + newResult);
    }
}
