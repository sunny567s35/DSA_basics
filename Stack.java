//stack using arrays

import java.util.*;

class Stack{
    private int top;
    private int arr[] ;
    private int capacity;
    
    //creating stack
    
    Stack(int size ){
        arr = new int[size];
        top = -1;
        capacity = size;

    }

    public void push(int s ){
        if( isFull()){
            System.out.println("Stack Overflow state !");
            System.exit(1);
        }
        else{
            System.out.println("Inserting "+ s);
            arr[++top] = s;

        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underlflow state !!");
            System.exit(1);
        }
        
            System.out.println("Popped number is : ");
            return arr[top--];
        
    }
    
    public Boolean isEmpty(){
        return top == -1;
    }
    
    public Boolean isFull(){
        return top == capacity-1;
    }
    
    public int size(){
        return top+1;
    }

    public void displayStack(){
        for(int i=0;i<= top;i++){
            System.out.println(arr[i]);

        }
    }

    public static void main(String args[]) {
       
        
        Stack stack = new Stack(5);

        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        System.out.println();
        System.out.println( stack.pop());
        System.out.println();
        stack.displayStack();
        
    }
}