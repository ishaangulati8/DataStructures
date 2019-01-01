import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    private class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    private Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        } else if (data < node.data) {
            node.left = insert(node.left, data);
        }
        return node;
    }

    public boolean search(int data) {
        return search(root, data);
    }

    public boolean search(Node node, int data) {
        if (node == null) {
            return false;
        } else if (node.data == data) {
            return true;
        } else if (node.data > data) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + "  ");
            inorder(node.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    public int height() {
        return height(root);
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public void postfix() {
        postfix(root);
    }

    public void postfix(Node node) {
        if (node != null) {
            postfix(node.left);
            postfix(node.right);
            System.out.print(node.data + "  ");
        }
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        int leftheight, rightheight;
        leftheight = height(node.left);
        rightheight = height(node.right);
        if (Math.abs(leftheight - rightheight) <= 1 && isBalanced(node.left) && isBalanced(node.right)) {
            return true;
        }
        return false;
    }

    public void bfs() {
        bfs(root);
    }

    //    public void bfs(Node node) {
////        Queue<Node> queue = new LinkedList<>();
////        if (node != null) {
////            queue.add(node);
////            while (!queue.isEmpty()) {
////                Node temp = queue.poll();
////                System.out.println(temp.data);
////                if (temp.left != null) {
////                    queue.add(temp.left);
////                }
////                if (temp.right != null) {
////                    queue.add(temp.right);
////                }
////            }
////
////        } else {
////            return;
////        }
////    }
    public void bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        if (node != null) {
            ((LinkedList<Node>) queue).add(node);
            while (!queue.isEmpty()) {
                Node t = ((LinkedList<Node>) queue).pop();
                System.out.print(t.data + " ");
                if (t.left != null) {
                    ((LinkedList<Node>) queue).add(t.left);
                }
                if (t.right != null) {
                    ((LinkedList<Node>) queue).add(t.right);
                }
            }
        } else {
            return;
        }
    }

    public int number() {
        return number(root);
    }

    public int number(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + number(node.right) + 1 + number(node.left);

    }

    public int iterativenumber() {
        return iterativenumber(root);
    }

    public int iterativenumber(Node node) {
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        if (node != null) {
            ((LinkedList<Node>) queue).add(node);
            count += 1;
            while (!queue.isEmpty()) {
                Node temp = queue.poll();

                if (temp.left != null) {
                    ((LinkedList<Node>) queue).add(temp.left);
                    count += 1;
                }
                if (temp.right != null) {
                    ((LinkedList<Node>) queue).add(temp.right);
                    count += 1;
                }
            }

        }
        return count;
    }

    public boolean isidentical(BinarySearchTree other) {

        return isidentical(this.root, other.root);
    }

    public boolean isidentical(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if ((tree1 == null && tree2 != null) || (tree1 != null && tree2 == null)) {
            return false;
        }
        if (tree1 != null && tree2 != null) {
            if (tree1.data == tree2.data) {
                return isidentical(tree1.left, tree2.left) && isidentical(tree1.right, tree2.right);
            }
        }
        return false;
    }

    public int maxdiameter() {
        return maxdiameter(root);
    }

    public int maxdiameter(Node node) {
        int total = 0;
        if (node == null) {
            return 0;
        }
        int lh = 0, rh = 0;
        lh = height(node.left);
        rh = height(node.right);
        total = lh + rh + 1;
        total = Math.max(total, maxdiameter(node.left));
        total = Math.max(total, maxdiameter(node.right));
        return total;
    }

    public int countleaf() {
        return countleaf(root);
    }

    public int countleaf(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countleaf(node.left) + countleaf(node.right);

    }

    /*A path containing sum equal to K*/
    public boolean containsSum(int k) {
        return containsSum(root, k);
    }

    public boolean containsSum(Node node, int k) {
        if (node == null) {
            if (k == 0) {
                return true;
            } else {
                return false;
            }
        }
        int total;
        total = k - node.data;

        if (total == 0) {
            return true;
        }
        boolean l = (node.left == null) ? false : containsSum(node.left, total);
        boolean r = (node.right == null) ? false : containsSum(node.right, total);
        if (l || r) {
            return true;
        }
        return false;
    }

    public void printpath() {
        //int[] arr = new int[1000];
        List<Integer> arr = new ArrayList<>();
        int top = 0;
        printpath(root, top, arr);
    }

    public void printpath(Node node, int top, List<Integer> arr) {
        if (node == null) {
            return;
        }
        arr.add(top, node.data);
        if (node.left == null && node.right == null) {
            for (Integer i : arr) {
                System.out.print(i + " ");
            }
            // System.out.print(node.data);
            System.out.println();
            return;

        }
        printpath(node.left, top + 1, arr);
        printpath(node.right, top + 1, arr);

    }

    public int maxdiameterlevel() {
        return maxdiameterlevel(root);
    }

    public int maxdiameterlevel(Node node) {
        if (node == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int Max = 0, count = 0;
        queue.add(node);
        while (!queue.isEmpty()) {
            count = queue.size();
            Max = Math.max(Max, count);
            while (count != 0) {
                Node temp = queue.poll();
                if (temp.left != null) {
                    ((LinkedList<Node>) queue).add(temp.left);
                }
                if (temp.right != null) {
                    ((LinkedList<Node>) queue).add(temp.right);
                }
                count--;
            }
        }
        return Max;
    }

    public void iterativePre() {
        iterativePre(root);
    }

    public void iterativePre(Node node) {
        if (node == null) {
            System.out.println("tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            Node temp = stack.peek();
            System.out.print(temp.data + " ");
            stack.pop();
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void iterativePost() {
        iterativePost(root);
    }

    public void iterativePost(Node node) {
        if (node == null) {
            System.out.println("Tree is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Node> stack1 = new Stack<>();
        stack.push(node);
        while (!stack.empty()) {
            Node temp = stack.pop();
            stack1.push(temp);
            if (temp.left != null) {
                stack.push(temp.left);
            }
            if (temp.right != null) {
                stack.push(temp.right);
            }
        }
        while (!stack1.isEmpty()) {
            Node temp = stack1.pop();
            System.out.print(temp.data + " ");
        }
    }

    public void reverselevel(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node t = ((LinkedList<Node>) queue).pop();
            stack.add(t);
            if (t.left != null) {
                queue.add(t.left);
            }
            if (t.right != null) {
                queue.add(t.right);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}

