package com.company;

public class KMP {
    /*this will compute lps Array
     * 1. Check if characters match if they match then increment i and j and add j to lps[i]
     * 2. if they do not match
     *    1. if j == 0 : means forst characters do not match
     *    2. if j != 0 first characters match
     */

    public void ComputeLps(String pat, int M, int lps[]) {
        int i = 1, j = 0;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(j)) {
                j++;
                lps[i] = j;
                i++;
            }
            else {
                if (j != 0) {
                    j = lps[j-1];
                } else {
                    lps[i] = j;
                    i++;
                }
            }
        }
    }
    public void KMPSearch (String pat, String text) {
        int M = pat.length(), N = text.length();
        int[] lps = new int[M];
        ComputeLps(pat,M, lps);
        int i = 0, j= 0;
        while (i < N) {
            if (pat.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Found match at: "  + (i-j));
                j = 0;
            } else if ((i < N) && (pat.charAt(j) != text.charAt(i))) {
                if (j != 0) {
                    j = lps[j-1];
                } else {
                    i++;
                }
            }
        }

    }


    public static void main(String[] args) {
        KMP obj = new KMP();
        String pat = "ASDF";
        String text = " ASDFGHJKLASDFASDFKLASDKLASDF";
        obj.KMPSearch(pat, text);

    }
}




















