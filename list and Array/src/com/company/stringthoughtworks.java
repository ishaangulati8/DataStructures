package com.company;

import java.util.*;


public class stringthoughtworks {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        StringBuffer br = new StringBuffer();
        int  num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' ) {
                num = num*10 + (int)arr[i] - (int)'0';
            }
            else if (arr[i] == '(') {
                int j = i+1;
                String temp = "";
                while (j < arr.length && arr[j] != ')') {
                    temp = temp.concat(Character.toString(arr[j]));

                    j = j+1;
                }
                for (int k = 0; k < num; k++) {
                     br.append(temp);

                }
                //System.out.println("num" + num);
                num = 0;
                i = j;
            } else {
                br.append(arr[i]);

            }

        }
        System.out.println(br);
    }
}
