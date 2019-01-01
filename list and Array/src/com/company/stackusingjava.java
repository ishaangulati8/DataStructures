package com.company;

public class stackusingjava {
    final static int Capacity = 10;
    int capacity;
    int top = -1;
    protected int[] stackrep;

    public stackusingjava() {
        this(Capacity);
    }

    public stackusingjava(int cap) {
        capacity = cap;
        stackrep = new int[cap];
    }

    public int getsize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public int getTop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        return stackrep[top];
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        int data = stackrep[top];
        stackrep[top--] = Integer.MIN_VALUE;
        return data;
    }

    public void push(int data) throws Exception {
        if (top == capacity) {
            throw new Exception("stack is full");
        } else {
            stackrep[++top] = data;
        }
    }

    @Override
    public String toString() {
        String s = "[";
        if (!isEmpty()) {
            for (int i = 0; i < top; i++) {
                s += "," + stackrep[i];
            }
        }
        return s + "]";


    }

    public static void main(String[] args) throws Exception {
        stackusingjava ob = new stackusingjava(6);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);
        ob.pop();
        ob.pop();
//        ob.pop();
//        ob.pop();
//        ob.pop();

        String a = ob.toString();
        System.out.println(a);

    }
}
