package Leetcode_Java.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();

    public void MyStack() {
    }

    //Since Queue is FIFO but Stack is LIFO
    //We need to shift the last adding element at first
    //For example , queue already have 2 , now adding 1. Now the queue is 2 , 1
    //So correct size of queue is 2 , while loop start
    //queue add the removing element at queue since FIFO. Now the queue is 1 , 2
    public void push(int x) {
        q1.add(x);
        int size = q1.size();
        while (size > 1) {
            q1.add(q1.remove());
            size--;
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

