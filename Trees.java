import BST.CreateBST;

public class Trees {
    public static void main(String[] args) {
        CreateBST tree = new CreateBST();
        int[] nodes = {10,5,15,3,7,1,9,2,8};
        // tree.createNormalBSTree(nodes); // creates a normal bstree without balancing
        tree.createBalancedBSTree(nodes);
        System.out.print("PreOrder Traversal : ");
        tree.PreorderTraversal(tree.head);
        System.out.println("");

        System.out.print("InOrder Traversal : ");
        tree.InorderTraversal(tree.head);
        System.out.println("");

        System.out.print("PostOrder Traversal : ");
        tree.PostorderTraversal(tree.head);
        System.out.println("");

        System.out.print("Nodes with depths : ");
        tree.depths(tree.head,0);
        System.out.println("");
    }
}
