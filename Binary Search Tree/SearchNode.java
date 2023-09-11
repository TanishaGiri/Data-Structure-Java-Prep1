public class SearchNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
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
            return ;
        }

        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data<key){
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }
    public static void main(String []ar){
        int []values = new int[]{5 , 1, 3, 4, 2, 7};
        int key = 8;
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, key)){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
