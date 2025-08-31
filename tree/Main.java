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
        // 
        int[]arr={2,56,5,1,5,-4,6,8};
        segment_tree tree= new segment_tree(arr);
        tree.Display();
        System.out.println(tree.query(1, 5));
        
    }
}
