package com.company;

public class lcsrecur {

    public static int dplcs(String a, String b, int M, int N) {
        int[][] lcs = new int[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }
        return lcs[M][N];
    }

    public static int recurlcs(String a, String b, int M, int N) {
        if (M == 0 || N == 0) {
            return 0;
        }
        if (a.charAt(M - 1) == b.charAt(N - 1)) {
            return 1 + recurlcs(a, b, M - 1, N - 1);
        } else {
            return Math.max(recurlcs(a, b, M - 1, N), recurlcs(a, b, M, N - 1));
        }
    }


    public static void main(String[] args) {
        String a = "asdfghjkl";
        String b = "asdjkl";
        //lcsrecur ob = new lcsrecur();
        System.out.println(recurlcs(a, b, a.length(), b.length()));
        System.out.println(dplcs(a, b, a.length(), b.length()));

    }
}
