package com.company;

import java.util.*;


public class employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int lim = n / 2;
        for (int i = 1; i <= lim; i++) {
            if ((n - i) % i == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}

