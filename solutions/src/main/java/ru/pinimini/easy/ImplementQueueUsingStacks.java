package ru.pinimini.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    Stack <Integer> in,out;

    public ImplementQueueUsingStacks(){
        in=new Stack<>();
        out=new Stack<>();
    }
    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if(out.empty()!=true)
        {
            return out.pop();
        }
        else
        {
            while(in.empty()==false)
                out.push(in.pop());

        }
        return out.pop();
    }

    public int peek() {
        if(out.empty()!=true)
        {
            out.peek();
        }
        else
        {
            while(in.empty()==false)
                out.push(in.pop());
        }
        return out.peek();
    }

    public boolean empty() {
        return out.empty() && in.empty();

    }

/*    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int x) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(x);
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

    }

    public int pop() {
        return stack2.pop();
    }

    public int peek() {
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.empty();
    }*/
}
