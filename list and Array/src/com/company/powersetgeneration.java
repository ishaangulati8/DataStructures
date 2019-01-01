package com.company;

        import java.util.*;


public class powersetgeneration {
//    public static LinkedList<String> permutations(String s) {
//        LinkedList<String> ll = new LinkedList<>();
//    }
//    public static String swap(String s, int i , int j)
//    {
//
//    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<String> ll = new LinkedList<>();
        int n = (int) Math.pow(str.length(), 2);
        for (int i = 0; i < n; i++) {
            String a = " ";
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) > 0) {
                    a = a.concat(Character.toString(str.charAt(j)));
                }
            }
            ll.add(a);
        }
        System.out.println(ll);
    }
}
