import java.util.Scanner;

public class Binarytree {
    private static class Node{
        int value;
        Node left;
        Node right;
        private Node(int value){
            this.value = value;
        }

    }
    private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate (scanner, root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to add the left child of " + node.value + ": ");
        int left=scanner.nextInt();
        if(left==1){
            System.out.println("Enter the value for left child of " + node.value + ": ");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to add the right child of " + node.value + ": ");
        int right = scanner.nextInt();
        if (right == 1) {
            System.out.println("Enter the value for right child of " + node.value + ": ");
            int value = scanner.nextInt();
            node.right = new Node(value);
        populate(scanner, node.right);
      }
    }
    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
            System.out.println(indent + node.value);
            display(node.left, indent + "   ");
            display(node.right, indent + "   ");
        
    
    }
    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if(level !=0){
            for(int i=0;i<level;i++){
                System.out.print("    ");
            }
            System.out.println("|------>" + node.value);
        }else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

