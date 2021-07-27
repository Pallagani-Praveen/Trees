import BST.CreateBST;

public class Trees {
    public static void main(String[] args) {
        CreateBST tree = new CreateBST();
        int[] nodes = {10,5,15,3,7,1,9,2,8};
        tree.createNormalBSTree(nodes);
        System.out.print("InOrder Traversal : ");
        tree.InorderTraversal(tree.head);
    }
}
