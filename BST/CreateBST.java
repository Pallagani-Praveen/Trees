package BST;

import java.util.Arrays;


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

    Node (int value,Node left,Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
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

    public Node balanceTree(int[] nodes,int start,int end) {
        if(start>=end) {
            return null;
        } else {
            int mid = (start+end)/2;
            return new Node(nodes[mid],this.balanceTree(nodes,start,mid),this.balanceTree(nodes,mid+1,end));
        }
    }

    public void createBalancedBSTree(int[] nodes) {
        int n = nodes.length;
        Arrays.sort(nodes);
        Node head = this.balanceTree(nodes,0,n);
        this.head = head;
    }

    public void InorderTraversal(Node node) {
        if(node!=null) {
            this.InorderTraversal(node.left);
            System.out.print(node.value + " ");
            this.InorderTraversal(node.right);
        }
    }

    public void PreorderTraversal(Node node) {
        if(node!=null) {
            System.out.print(node.value + " ");
            this.InorderTraversal(node.left);
            this.InorderTraversal(node.right);
        }
    }

    public void PostorderTraversal(Node node) {
        if(node!=null) {
            this.InorderTraversal(node.left);
            this.InorderTraversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void depths(Node node,int level) {
        if(node!=null) {
            this.depths(node.left, level+1);
            System.out.print(node.value+"{"+level+"} ");
            this.depths(node.right, level+1);
        }
    }
}

