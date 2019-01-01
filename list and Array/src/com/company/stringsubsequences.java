package com.company;

import java.math.BigInteger;
import java.util.*;

public class stringsubsequences {
    static boolean isanagram(String A, String B) {

        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LinkedList<String> ll = new LinkedList<>();
        int limit = (int) (Math.pow(str.length(), 2));
        char[] arr = str.toCharArray();
        for (int i = 0; i < limit; i++) {
            String temp = " ";
            for (int j = 0; j < str.length(); j++) {
                if (BigInteger.valueOf(i).testBit(j)) {
                    temp = temp.concat(Character.toString(arr[j]));

                }
            }
            ll.add(temp);
        }
        System.out.println(ll);
        int count = 0;
//        for (int i = 0; i < ll.size(); i++) {
//            for (int j = 0; j < ll.size(); j++) {
//                if (isanagram(ll.get(i), ll.get(j)) && i != j) {
//                    count++;
//                }
//            }
//        }
        System.out.println(count);
        System.out.println("+++++++++++++++++++");
        System.out.println(2&1);
    }
}
