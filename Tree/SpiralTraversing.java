import java.util.*;

public class SpiralTraversing {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Spiral {
        // Function to return a list containing the level order
        // traversal in spiral form.
        ArrayList<Integer> findSpiral(Node root) {
            ArrayList<Integer> arr = new ArrayList<>();
            Stack<Integer> s = new Stack<>();
            boolean flag = true;

            if (root == null) {
                return arr;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    Node curr = queue.poll();
                    if (flag) {
                        s.push(curr.data);
                    } else {
                        arr.add(curr.data);
                    }

                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }

                flag = !flag;

                while (!s.isEmpty()) {
                    arr.add(s.pop());
                }
            }

            return arr;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Spiral spiral = new Spiral();
        ArrayList<Integer> spiralTraversal = spiral.findSpiral(root);

        // Print the spiral traversal of the binary tree
        System.out.println(spiralTraversal);
    }
}

