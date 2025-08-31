public class TreeAVL {
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

    public TreeAVL() {
        this.root = null;
    }

    public node getRoot() {
        return root;
    }

    public int height(node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        displayHelper(root, "Root Node:,");
    }

    private void displayHelper(node curr, String detail) {

        if (curr == null) {
            return;
        }
        System.out.println(detail + curr.getVal());
        displayHelper(curr.left, "Left Child of " + curr.getVal() + ": ");
        displayHelper(curr.right, "Right Child of " + curr.getVal() + ": ");
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            this.AVLinsert(num);
        }
    }

    public void AVLinsert(int val) {
        root = insertHelper(root, val);
    }

    private node insertHelper(node curr, int val) {
        if (curr == null) {
            return new node(val);
        }
        if (val < curr.getVal()) {
            curr.left = insertHelper(curr.left, val);
        } else {
            curr.right = insertHelper(curr.right, val);
        }
        curr.height = 1 + Math.max(height(curr.left), height(curr.right));
        return rotate(curr);
    }

    private node rotate(node curr) {
        if (height(curr.left) - height(curr.right) > 1) {
            if (height(curr.left.left) - height(curr.left.right) >= 0) {
                return rightRotate(curr);
            }
            if (height(curr.left.right) - height(curr.left.left) > 0) {
                curr.left = leftRotate(curr.left);
                return rightRotate(curr);
            }

        }
        if (height(curr.left) - height(curr.right) < -1) {
            if (height(curr.right.right) - height(curr.right.left) >= 0) {
                return leftRotate(curr);
            }
            if (height(curr.right.left) - height(curr.right.right) > 0) {
                curr.right = rightRotate(curr.right);
                return leftRotate(curr);
            }

        }
        return curr;
    }
    private node rightRotate(node curr){
        node c=curr.left;

        node t=c.right;
        c.right=curr;
        curr.left=t;

        curr.height=Math.max(height(curr.left),height(curr.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return c;
    }
    private node leftRotate(node curr){
        node c=curr.right;
        node t=c.left;

        c.left=curr;
        curr.right=t;

        curr.height=Math.max(height(curr.left),height(curr.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return c;
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

    public void preorder(node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getVal() + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(node node) {
        if (node == null) {
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.print(node.getVal() + " ");
    }

    public void inorder(node node) {
        if (node == null) {
            return;
        }
        preorder(node.left);
        System.out.print(node.getVal() + " ");
        preorder(node.right);
    }
}
