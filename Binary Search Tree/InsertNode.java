public class InsertNode {
    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        // to check if the node is already inserted then no need to modify the tree
        if(root.data == val){
            return root;
        }

        if(root.data<val){
            root.right = insert(root.right, val);
        }else{
            root.left = insert(root.left, val);
        }

        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] ar){
        int []values = new int[]{5, 1, 3, 4, 2, 7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
    }
}
