package MarchLeetcodeChallenge2021;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevelsInBinaryTree {

    public class TreeNode {
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

    static List<Double> levels;

    public List<Double> averageOfLevels(TreeNode root) {
        //We will store our level sums in this ArrayList
        levels = new ArrayList<>();

        //Utility method to find average for each level
        findAverageLevel(root);

        return levels;

    }

    private void findAverageLevel(TreeNode root) {

        //Queue is used for Level Order Traversal
        Queue<TreeNode> queue = new LinkedList<>();

        //Add the root element
        queue.add(root);

        //We run the loop until it is empty
        while (!queue.isEmpty()) {

            //denotes the total number of elements of in one level
            int size = queue.size();
            //Sum of all the elements in a level
            double sum = 0;
            //Go through all the elements in a level
            for (int i = 0; i < size; i++) {

                //Pop the first element from the queue
                TreeNode curr = queue.poll();

                sum += (double) curr.val;

                //Add the children to the queue
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);

            }
            //Find the average
            double res = (double) sum / size;
            levels.add(res);
        }

    }
}
