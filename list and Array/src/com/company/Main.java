package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        Integer a = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            arr.addFirst(a);
        }
        LinkedList<Integer> queue = new LinkedList<>();
        Collections.sort(arr);
        queue.push(arr.getFirst());
        for (int i = 1; i < n; i++) {
            Integer b = arr.get(i);
            if (b.compareTo(queue.getFirst()) == 0) {
                queue.push(b);
            }
            if (b.compareTo(queue.getFirst()) > 0) {
                queue.removeFirst();
                queue.addLast(b);
            }
        }
        Integer sum = 0;
        while (!queue.isEmpty()) {
            sum += queue.pop();
        }
        System.out.println(sum);
    }
}
