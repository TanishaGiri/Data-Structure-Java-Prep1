import java.util.*;

public class BottomView {

    static class TreeNode {
        int val;
        int hd; // horizontal distance
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
        public List<Integer> bottomView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Map<Integer, Integer> map = new TreeMap<>();
            Queue<TreeNode> queue = new LinkedList<>();
            root.hd = 0;
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode currNode = queue.poll();
                map.put(currNode.hd, currNode.val);

                if (currNode.left != null) {
                    currNode.left.hd = currNode.hd - 1;
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    currNode.right.hd = currNode.hd + 1;
                    queue.add(currNode.right);
                }
            }

            for (int val : map.values()) {
                result.add(val);
            }

            return result;
        }
    }

    public static void main(String[] args) {
        // Construct a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution solution = new Solution();
        List<Integer> bottomView = solution.bottomView(root);

        // Print the bottom view of the binary tree
        System.out.println(bottomView);
    }
}
