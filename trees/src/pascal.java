import java.util.Scanner;

public class pascal {
    public void findlps(String a, int M, int[] lps) {
        int i = 1, len = 0;
        lps[0] = 0;
        while (i < M) {
            if (a.charAt(len) == a.charAt(i)) {
                len += 1;
                lps[i] = len;
                i += 1;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i += 1;
                }
            }
        }
    }

    public void find(String a, String b) {
        boolean found = false;
        int M = a.length();
        int N = b.length();
        int[] lps = new int[M];
        int i = 0, j = 0;
        findlps(a, M, lps);
        while (i < N) {
            if (a.charAt(j) == b.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                System.out.println("Pattern found at" + (i - j));
                j = lps[j - 1];
                found = true;
            } else if (i < N && a.charAt(j) != b.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        if (!found) {
            System.out.println("Pattern not found");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        pascal p = new pascal();
        p.find("asdf", "asdasdfasdf");

    }
}

