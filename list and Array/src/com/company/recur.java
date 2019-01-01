package com.company;

import java.util.Scanner;


public class recur {

    public static long func(long x, long y) {
        if (x == 0) {
            return (y + 1) % 1000;
        } else if ((x > 0) && (y == 0)) {
            return (func(x - 1, 1)) % 1000;
        } else {
            return func(x - 1, func(x, y - 1));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long res = func(3, 500);
        System.out.format("%03d%n", res);

    }
}
