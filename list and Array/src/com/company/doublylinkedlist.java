package com.company;


public class doublylinkedlist {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int x, Node next, Node prev) {
            this.data = x;
            this.next = next;
            this.prev = prev;
        }

    }

    int size = 0;

    Node sentinel = new Node(22, null, null);

    void addatfront(int data) {
        if (sentinel.next == null) {
            sentinel.next = new Node(data, null, sentinel);
        } else {
            Node q = new Node(data, null, null);
            q.next = sentinel.next;
            sentinel.next.prev = q;
            sentinel.next = q;
            q.prev = sentinel;
            size += 1;
        }
    }

    void addatlast(int data) {
        Node head = sentinel.next;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(data, null, head);
        size += 1;
    }

    void addatindex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("index out of bound");
            return;
        }
        if (index == 0) {
            addatfront(data);

        } else if (index == size) {
            addatlast(data);
        } else {
            int count = 0;
            Node head = sentinel.next;
            Node p = sentinel.next;
            while (count < index - 1) {
                count++;
                head = head.next;
                p = p.next;
            }
            head.next = new Node(data, head.next, head);
            head.next.next.prev = head.next;
            size += 1;
        }

    }

    void printall() {
        Node head = sentinel.next;
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    void deleteat(int index) {
        //index = index - 1;
        if (index < 0 || index > size) {
            System.out.println("index out of bound");
            return;
        } else if (index == 0) {
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
            //size -= 1;
            size -= 1;
            return;
        }
        if (index == size) {
            Node head = sentinel.next;
            while (head.next != null) {
                head = head.next;
            }
            head.prev.next = null;
            //head = null;
            size -= 1;
            return;
        } else {
            Node head = sentinel;
            //Node p = sentinel.next;
            int count = 0;
            while (count < index - 1) {
                head = head.next;
                //p = p.next;
                count++;
            }
            head.next = head.next.next;
            head.next.prev = head;
            size -= 1;

        }

    }

    boolean isthere(int data) {
        Node head = sentinel.next;
        while (head != null) {
            if (head.data == data) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    void deletedata(int data) {
        Node head = sentinel.next;
        boolean flag = isthere(data);
        if (flag) {
            if (sentinel.next.data == data) {
                sentinel.next = sentinel.next.next;
                sentinel.next.prev = sentinel;
            } else {
                Node p = sentinel;
                while (head.data != data) {
                    head = head.next;
                    p = p.next;
                }
                if (head.next != null) {
                    p.next = head.next;
                    head.next.prev = p;
                } else {
                    p.next = null;
                    head.prev = null;
                    head = null;

                }
            }
            size -= 1;
        } else {
            System.out.println(data + " not found");
        }

    }

    public static void main(String[] args) {
        doublylinkedlist ob = new doublylinkedlist();
        ob.addatfront(12);
        ob.addatfront(23);
        ob.addatfront(32);
        ob.addatindex(1, 66);
        ob.printall();
        System.out.println();
        System.out.println("size " + ob.size);
        ob.deleteat(2);
        ob.deletedata(23);
        ob.printall();
        System.out.println(ob.isthere(23));
        ob.addatfront(89);
        System.out.println();
        ob.printall();
        ob.deletedata(66);
        System.out.println();
        ob.printall();
        ob.deletedata(07);
        System.out.println();
        System.out.println(ob.size + 1);
    }
}
