package LC501_600;

import java.util.ArrayList;
import java.util.List;

public class LC530 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

        public int getMinimumDifference(TreeNode root) {

            List<Integer> list = new ArrayList<>();

            list = solve(root, list);

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < list.size() - 1; i++) {
                min = Math.min(min, Math.abs(list.get(i) - list.get(i + 1)));
            }


            return min;

        }

        private static List<Integer> solve(TreeNode root, List<Integer> list) {

            if (root == null)
                return null;

            solve(root.left, list);
            list.add(root.val);
            solve(root.right, list);

            return list;


        }
    }
