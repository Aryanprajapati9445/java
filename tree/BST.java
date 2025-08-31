class BST {
public class node {
private int val;
private node left;
private node right;
private int height;

public node(int val) {
this.val = val;
this.left = null;
this.right = null;
this.height = 0;

}

public int getVal() {
    return val;
}
}
private node root;
public BST() {
    this.root = null;
}
public node getRoot() {
    return root;
}
public int height(node node){
    if(node ==null){
        return -1;
    }
    return node.height;
}
public boolean isEmpty() {
    return root == null;
}
public void display(){
    displayHelper(root,"Root Node:,");
}
private void displayHelper(node curr,String detail){

    if(curr == null){
        return;
    }
    System.out.println(detail + curr.getVal());
    displayHelper(curr.left, "Left Child of " + curr.getVal() + ": ");
    displayHelper(curr.right, "Right Child of " + curr.getVal() + ": ");
}
public void populate(int[] nums){
    for(int num : nums){
        this.insert(num);
    }
}
public void insert(int val){
    root = insertHelper(root, val);
}
private node insertHelper(node curr, int val){
   if(curr == null){
       return new node(val);
   }
   if(val < curr.getVal()){
       curr.left = insertHelper(curr.left, val);
   }else{
       curr.right = insertHelper(curr.right, val);
   }
   curr.height = 1 + Math.max(height(curr.left), height(curr.right));
   return curr;
}
public boolean isBalanced() {
    return isBalancedHelper(root);
}
private boolean isBalancedHelper(node curr) {
    if (curr == null) {
        return true;
    }
    int balanceFactor = height(curr.left) - height(curr.right);
    if (Math.abs(balanceFactor) > 1) {
        return false;
    }
    return isBalancedHelper(curr.left) && isBalancedHelper(curr.right);
}
public void preorder(node node){
    if(node == null){
        return;
    }
    System.out.print(node.getVal() + " ");
    preorder(node.left);
    preorder(node.right);
}
public void postorder(node node){
    if(node == null){
        return;
    }
    preorder(node.left);
    preorder(node.right);
    System.out.print(node.getVal() + " ");
}
public void inorder(node node){
    if(node == null){
        return;
    }
    preorder(node.left);
    System.out.print(node.getVal() + " ");
    preorder(node.right);
}
}
