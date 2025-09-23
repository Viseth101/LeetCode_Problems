public class DS_Exercise_BST {

    public static Tree insert(Tree BST, int value) {
        if (BST == null) {
            return new Tree(value);
        }
        int BSTValue = (int) BST.info;
        if (value < BSTValue) {
            BST.left = insert(BST.left, value);
        } else {
            BST.right = insert(BST.right, value);
        }
        return BST;
    }

    public static void printPreOrder(Tree BST) {
        if (BST == null) {
            System.out.print("- ");
            return;
        }
        System.out.print(BST.info + " ");
        if (BST.left == null && BST.right == null) return;
        System.out.print("[ ");
        printPreOrder(BST.left);
        printPreOrder(BST.right);
        System.out.print("] ");
    }

    public static int height(Tree node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean pathFinder(Tree BST, int find){
        if (BST == null) {
            System.out.printf(") Not Found!\n");
            return false;
        }
        int BSTValue = (int) BST.info;
        if (find == BSTValue) {
            System.out.printf(") Found!\n");
            return true;
        } else if (find < BSTValue) {
            System.out.print("L");
            return pathFinder(BST.left, find);
        } else {
            System.out.print("R");
            return pathFinder(BST.right, find);
        }
    }

    public static void main(String[] args) {
        int n = 10 + (int) (Math.random() * 11);
        Tree BST = null;
        System.out.printf("--- Random numbers [%d] ---\n", n);
        for (int i = 0; i < n; i++) {
            int ran = (int) (Math.random() * 51);
            System.out.print(ran + " ");
            BST = insert(BST, ran);
        }
        System.out.printf("\n--- Tree (Height = %d) ---\n", height(BST));
        printPreOrder(BST);
        System.out.println("\n--- Search ---");
        boolean found = false;
        while(!found){
            int find = (int) (Math.random() * 51);
            System.out.print(find + ": (");
            found = pathFinder(BST, find);
        }
    }
}
