import java.util.*;

public class VerticalOrderTraversing {

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
        class Pair {
            int value, row;

            public Pair(int value, int row) {
                this.value = value;
                this.row = row;
            }
        }

        private void dfs(TreeNode root, int col, int row, TreeMap<Integer, List<Pair>> map) {
            if (root == null) {
                return;
            }

            if (!map.containsKey(col)) {
                map.put(col, new ArrayList<>());
            }
            map.get(col).add(new Pair(root.val, row));

            dfs(root.left, col - 1, row + 1, map);
            dfs(root.right, col + 1, row + 1, map);
        }

        public List<List<Integer>> verticalTraversal(TreeNode root) {
            TreeMap<Integer, List<Pair>> map = new TreeMap<>();
            List<List<Integer>> result = new ArrayList<>();

            dfs(root, 0, 0, map);

            for (Map.Entry<Integer, List<Pair>> entry : map.entrySet()) {
                List<Pair> valuePair = entry.getValue();
                Collections.sort(valuePair, new Comparator<Pair>() {
                    @Override
                    public int compare(Pair p1, Pair p2) {
                        if (p1.row < p2.row) {
                            return -1;
                        } else if (p1.row > p2.row) {
                            return 1;
                        } else {
                            return Integer.compare(p1.value, p2.value);
                        }
                    }
                });
                List<Integer> ans = new ArrayList<>();
                for (Pair p : valuePair) {
                    ans.add(p.value);
                }
                result.add(ans);
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
        List<List<Integer>> verticalOrder = solution.verticalTraversal(root);

        // Print the vertical order traversal
        for (List<Integer> col : verticalOrder) {
            System.out.println(col);
        }
    }
}
