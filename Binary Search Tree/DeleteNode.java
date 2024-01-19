public class DeleteNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (root.data > key) {
            root.left = delete(root.left, key);
        } else if (root.data < key) {
            root.right = delete(root.right, key);
        } else {
            //case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            //case 3

            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, key);
        }
        return root;
    }
        public static Node inorderSuccessor(Node root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

        public static void main(String []ar){
        int[] values = {5, 1, 3, 2, 4, 7};
        int key = 4;
        Node root = null;
        for(int i=0; i<values.length; i++){
            insert(root, values[i]);
        }
        inorder(root);
//          delete(root, key);

    }

}
