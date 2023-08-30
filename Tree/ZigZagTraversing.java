import java.util.*;

public class ZigZagTraversing {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public List<List<Integer>> zigzagTraversal(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean reverse = false;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> level = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    TreeNode currNode = queue.poll();
                    if (reverse) {
                        level.add(0, currNode.val); // Add to the front of the list for reverse direction
                    } else {
                        level.add(currNode.val); // Add to the end of the list for normal direction
                    }
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }

                result.add(level);
                reverse = !reverse; // Toggle the direction
            }

            return result;
        }
    }

    public static void main(String[] args) {
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        List<List<Integer>> zigzagTraversal = solution.zigzagTraversal(root);

        // Print the zigzag traversal of the binary tree
        for (List<Integer> level : zigzagTraversal) {
            System.out.println(level);
        }
    }
}
