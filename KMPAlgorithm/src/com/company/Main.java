package com.company;

import java.sql.SQLOutput;

public class Main {
    /*This function will compute tyhe lps array considering the prefix and
     * suffix of the given pattern and wil;l search for the commom prefix and
     * suffix and mark the positions for those into the array lps
     * so that backtracking is eliminated. */

    public void computelps(String pat, int M, int[] lps) {
        int i = 1, len = 0;
        lps[0] = 0;
        while ( i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len += 1;
                lps[i] = len;
                i += 1;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
    public int  find (String pat, String text) {
        int count = 0;
        int M = pat.length();
        int N = text.length();
        int i = 0, j = 0;
        int[] lps = new int[M];
        computelps(pat, M,lps);
        while (i < N) {
            if (pat.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println(pat + "Pattern found at index "+ (i - j));
                j = lps[j-1];
                count += 1;
            } else if (i < N && pat.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j-1];
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // write your code here
        String text = "ASDFGHASDTASDFqwertyuiopasdfASDF";
        String pat = "ASDF";
        Main obj = new Main();
        System.out.println(obj.find(pat, text));
    }
}
