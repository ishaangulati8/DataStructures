public class Main {

    public static void main(String[] args) {
        int min = 1;
        int max = 122;
        BinarySearchTree ob = new BinarySearchTree();
        for (int i = 0; i < 121; i++) {
            ob.insert((int) (Math.random() * ((max - min) + 1)) + min);
        }
        System.out.println(ob.search(3));
        System.out.println(ob.search(4));
        ob.inorder();
        System.out.println();
        System.out.println("height: " + ob.height());
        ob.postfix();
        System.out.println("balanced " + ob.isBalanced());
        System.out.println("BFS");
        ob.bfs();
        System.out.println("Number :" + ob.number());
        System.out.println("iterative number : " + ob.iterativenumber());
        BinarySearchTree ob2 = new BinarySearchTree();
        BinarySearchTree ob3 = new BinarySearchTree();
        for (int i = 0; i < 31; i++) {
            ob2.insert((int) (Math.random() * ((max - min) + 1) + min));
        }
        System.out.println(ob2.isidentical(ob2));
        ob3.insert(4);
        ob3.insert(3);
        ob3.insert(2);
        ob3.insert(5);
        ob3.insert(0);
        ob3.insert(8);
        System.out.println("diameter : " + ob3.maxdiameter());
        tree ob1 = new tree();
        ob1.insert(20);
        ob1.insert(12);
        ob1.insert(8);
        System.out.println("Balanced sum" + ob1.ischildsum());
        ob1.infix();
        ob1.preorder();
        System.out.println(ob3.countleaf());
        System.out.println(ob3.containsSum(9));
        System.out.println("level order");
        ob3.bfs();
        ob3.printpath();
        System.out.println();
        System.out.println("Max depth = " + ob3.maxdiameterlevel());
        ob3.iterativePre();
        System.out.println();
        ob3.preorder();
    }
}
