package com.company;

//import javafx.scene.input.InputMethodTextRun;

import java.util.*;


public class hakerrankdict {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        int n = sc.nextInt();
        String name = "";
        String number = "";
        for (int i = 0; i < n; i++) {
            name = sc.next();
            number = sc.next();
            map.put(name, number);
        }
        System.out.println("search string");

        ArrayList<String> find = new ArrayList<>();
        int j = 0;
        while (sc.hasNext()) {
            //find[j++] = sc.nextLine();
            String temp = new String(sc.next());
            if (temp.isEmpty()) {
                sc.close();
                break;

            } else {
                find.add(temp);
            }

        }

        for (int i = 0; i < find.size(); i++) {
            int k = 0;
            for (String key : map.keySet()) {
                if (find.get(i).equals(key)) {
                    System.out.println(key + " " + map.get(key));
                    break;
                } else {
                    k++;
                }
            }
            if (k == map.size()) {
                System.out.println("Not Found");
            }
        }
        System.out.println(map);
    }
}

