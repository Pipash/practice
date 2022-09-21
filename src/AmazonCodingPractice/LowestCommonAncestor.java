package AmazonCodingPractice;

public class LowestCommonAncestor {
    Node root;

    public LowestCommonAncestor() {
        //LowestCommonAncestor tree = new LowestCommonAncestor();
        this.root = new Node(20);
        this.root.left = new Node(8);
        this.root.right = new Node(22);
        this.root.left.left = new Node(4);
        this.root.left.right = new Node(12);
        this.root.left.right.left = new Node(10);
        this.root.left.right.right = new Node(14);
        //
        Node lca=this.lca(this.root, 10, 14);
        System.out.println(lca.data);
    }

    public Node lca(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }

        if (n1> node.data && n2 > node.data) {
            return lca(node.right, n1,n2);
        } else if (n1 < node.data && n2 < node.data) {
            return lca(node.left, n1, n2);
        } else {
            return node;
        }
    }
}

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}