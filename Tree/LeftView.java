import java.util.*;

public class LeftView {

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
        public List<Integer> leftSideView(TreeNode root) {
            List<Integer> level = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null) {
                return level;
            }
            queue.add(root);
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode currNode = queue.poll();
                    if (i == 0) {
                        level.add(currNode.val); // Add the first node of each level (leftmost node)
                    }
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }
            }
            return level;
        }
    }

    public static void main(String[] args) {
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution solution = new Solution();
        List<Integer> leftSideView = solution.leftSideView(root);

        // Print the left side view of the binary tree
        System.out.println(leftSideView);
    }
}
