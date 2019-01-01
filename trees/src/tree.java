public class tree {
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

    Node root = null;

    public void insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            if (root.left == null) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    public void infix() {
        infix(root);
    }

    public void infix(Node root) {
        if (root != null) {
            infix(root.left);
            System.out.println(root.data);
            infix(root.right);
        }
    }

    public void postfix() {
        postfix(root);
    }

    public void postfix(Node root) {
        if (root != null) {
            postfix(root.left);
            postfix(root.right);
            System.out.println(root.data);
        }

    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public int height() {
        return height(root);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + height(root.left), 1 + height(root.right));
    }

    public boolean ischildsum() {
        return ischildsum(root);
    }

    public boolean ischildsum(Node node) {
        if (node == null || (node.right == null && node.left == null)) {
            return true;
        }
        int a = node.data;
        int b = (node.left == null) ? 0 : node.left.data;
        int c = (node.right == null) ? 0 : node.right.data;
        if (a == c + b && ischildsum(node.right) && ischildsum(node.left)) {
            return true;
        }
        return false;
    }

}
