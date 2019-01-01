import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Graph {
    int V;
    LinkedList<Integer>[] adj;

    Graph(int n) {
        this.V = n;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addPath(int source, int dest) {
        adj[source].add(dest);
    }

    public boolean ispath(int source, int dest) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.empty()) {
            int s = stack.pop();
            if (visited[s] == false) {
                visited[s] = true;
            }
            for (int i = 0; i < V; i++) {
                for (Integer a : adj[i]) {
                    if (!visited[a]) {
                        stack.push(a);
                    }
                }
            }
        }
        return visited[dest];
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        ((LinkedList<Integer>) queue).add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.println(s);
            for (int i = 0; i < V; i++) {
                for (Integer x : adj[i]) {
                    if (!visited[x]) {
                        visited[x] = true;
                        ((LinkedList<Integer>) queue).add(x);
                    }
                }
            }
        }
    }


    public static void main(String args[]) {
        int n = 5;
        Graph op = new Graph(5);
        op.addPath(1, 2);
        op.addPath(1, 3);
        op.addPath(3, 4);
        System.out.println(op.ispath(1, 4));
        op.bfs(1);
    }
}
