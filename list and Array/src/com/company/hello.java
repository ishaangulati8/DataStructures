package com.company;
 class A {
    int a,b;
    public A(int a, int b) {
         this.a = a;
         this.b = b;
    }
    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public void sub( A other)
    {
        this.a = a;
        System.out.println("this"+this.a);
    }
     public void sub1( A other)
     {
         other.a = a;
         System.out.println("other"+other.a);
     }
    public void add(A other)
    {
        System.out.println(this.a + other.b);
        System.out.println(this.b + other.b);
        System.out.println(this.a);
        System.out.println(other.a);
        A ob = new A(3,2);
        System.out.println("calling sub");
        sub1(ob);
    }
}
public class hello {
    static void sum(int a, int b){
        System.out.println("hello");
        System.out.println(a+b);
        System.out.println("HELLO");
    }
    public static void main(String args[])
    {
        int a = 2;
        int b = 3;
        A obj = new A(a,b);
        A b1 = new A (4,5);
        //obj.sub(b1);
        //obj.print();
        b1.add(obj);
        obj.print();
        System.out.println("b1");
        obj.sub1(b1);
        b1.print();
    }
}
