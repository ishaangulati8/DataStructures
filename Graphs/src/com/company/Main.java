package com.company;

import java.util.*;

public class Main {
    private int V;
    private List<Integer>[] adj;

    Main(int n) {
        this.V = n;
        adj = new List[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void add(int a, int b) {
        adj[a].add(b);
    }

    public void dfs(int a) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        stack.add(a);
        while (!stack.empty()) {
            int v = stack.pop();
            if (!visited[v]) {
                System.out.print(a + " ");
                visited[v] = true;
            }
            for (int i = 0; i < V; i++) {
                for (int j : adj[i]) {
                    if (!visited[j]) {
                        stack.push(j);
                    }
                }
            }

        }

    }

    public void bfs(int a) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        Queue<Integer> queue = new LinkedList<>();
        ((LinkedList<Integer>) queue).push(a);
        while (!queue.isEmpty()) {
            int v = ((LinkedList<Integer>) queue).removeFirst();
            System.out.print(v + " ");
            for (int i = 0; i < V; i++) {
                for (int j : adj[i]) {
                    if (!visited[j]) {
                        ((LinkedList<Integer>) queue).add(j);
                        visited[j] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
    }
}
