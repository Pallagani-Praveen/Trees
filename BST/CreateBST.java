package BST;


class Node {
    int value;
    Node  left;
    Node right;
    Node() {}
    Node(int value) { 
        this.value = value;
        this.left = null;
        this.right = null;
    }
}


public class CreateBST {
    public Node head;

    public CreateBST() {
        this.head = null;
    }

    public Boolean isEmpty() { 
        return (this.head == null);
    }

    public Node addNode(Node node,int value) {
        if(node==null) {
            return new Node(value);
        } else if(node.value>value) {
            node.left = this.addNode(node.left,value);
        } else {
            node.right = this.addNode(node.right,value);
        }
        return node;
    }

    public void createNormalBSTree(int[] nodes) {
        Node head = new Node();
        head.value = nodes[0];
        for(int i = 1; i < nodes.length;i++) {
            head = this.addNode(head,nodes[i]);
        }
        System.out.println("Tree is created with nodes");
        this.head = head;
    }

    public void InorderTraversal(Node node) {
        if(node!=null) {
            this.InorderTraversal(node.left);
            System.out.print(node.value + " ");
            this.InorderTraversal(node.right);
        }
    }
}

