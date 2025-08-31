import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Binarytree tree = new Binarytree();
        // tree.populate(scanner);
        // tree.display();
        // BST bst = new BST();
        // int[] nums = {5, 3, 7, 2, 4, 6, 8};
        // bst.populate(nums);
        // bst.display();
        // bst.preorder(bst.getRoot());
        // System.out.println();
        // bst.inorder(bst.getRoot());
        // System.out.println();
        // bst.postorder(bst.getRoot());
        TreeAVL avl = new TreeAVL();
        for(int i=0;i<100;i++){
            avl.AVLinsert(i);
        }
        System.out.println(avl.height(avl.getRoot()));
        System.out.println();
    }
}
