package Assignment1_Recursion;

import java.util.Stack;

public class ReverseStack {
    static void reverseStack(Stack<Integer> stack){
        //Base case:-
        if(stack.empty())return;
        //Recurence Relation:-
        int temp = stack.pop();
        reverseStack(stack);
        insert(stack,temp);
    }
    static void insert(Stack<Integer> stack , int element){
       //Base Case:-
        if(stack.empty()){
            stack.push(element);
            return;
        }
        //Recurence Relation:-
        int temp = stack.pop();
        insert(stack,element);
        stack.push(temp);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(2);
        stack.push(0);
        stack.push(1);
        stack.push(14);
        System.out.println("Orginal Stack "+stack);
        reverseStack(stack);
        System.out.println("reversed stack is :" +stack);
    }
}
