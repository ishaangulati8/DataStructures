package com.company;

public class coinchange {
    public static int findlcsrecur(String a, String b, int M, int N) {
        if (N == 0 || M == 0) {
            return 0;
        }
        if (a.charAt(M - 1) == b.charAt(N - 1)) {
            return 1 + findlcsrecur(a, b, M - 1, N - 1);
        }
        return Math.max(findlcsrecur(a, b, M - 1, N), findlcsrecur(a, b, M, N - 1));
    }

    public static int findlcs(String a, String b) {
        int M = a.length(), N = b.length();
        int[][] lcs = new int[M + 1][N + 1];
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        return lcs[M][N];
    }

    public static String printlcs(String a, String b, String c, int M, int N) {
        if (M == 0 || N == 0) {
            return c;
        }
        if (a.charAt(M - 1) == b.charAt(N - 1)) {
            c += String.valueOf(a.charAt(M - 1)) + printlcs(a, b, c, M - 1, N - 1);
        } else {
            String d = printlcs(a, b, c, M - 1, N);
            String e = printlcs(a, b, c, M, N - 1);
            c = d.length() > e.length() ? d : e;
            //return c;
        }
        return c;

    }

    public static String printLcsitr(String a, String b) {
        int x = a.length(), y = b.length();
        String c = "";
        int len = 0;
        int row = 0, col = 0;
        int[][] mem = new int[x + 1][y + 1];
        int i = 0, j = 0;
        for (i = 0; i <= x; i++) {
            for (j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    mem[i][j] = 0;
                } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    mem[i][j] = mem[i - 1][j - 1] + 1;
                    if (len < mem[i][j]) {
                        len = mem[i][j];
                        row = i;
                        col = j;
                    }
                } else {
                    mem[i][j] = 0;
                }
            }
        }
        if (len == 0) {
            return c;
        }
        while (mem[row][col] != 0) {
            c = c + a.charAt(row - 1);
            --len;
            row--;
            col--;
        }
        return c;
    }

    public static void main(String[] args) {
        String a = "";
        String b =  "qwwrrtewasdfasdfghgsfdhjgkjhl;qwertyuiopcZXvccvmb,312454657687980cdvzfbnceawRESGRDHFGHQTWEYRUTIYUL CXV";
        int M = a.length(), N = b.length();
        System.out.println(findlcs(a, b));
        //System.out.println(findlcsrecur(a, b, M, N));
        String c = "";
        //System.out.println(printlcs(a,b,c,M,N));
        System.out.println(printLcsitr(a, b));
        int n = 0;
        int i

    }
}
