import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class LevelOrderTraversing {
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

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public List<List<Integer>> traversing(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            Queue<Node> queue = new LinkedList<>();

            if (root == null) {
                return result;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    Node currNode = queue.poll();
                    list.add(currNode.data);
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
                result.add(list);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] nodes = new int[]{1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        BinaryTree traverse = new BinaryTree();
        List<List<Integer>> levelOrder = traverse.traversing(root);

        // Print the level-order traversal
        for (List<Integer> level : levelOrder) {
            System.out.println(level);
        }
    }
}
