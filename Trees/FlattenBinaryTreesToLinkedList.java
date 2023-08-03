/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // Save the right child before modifying it
        TreeNode rightChild = root.right;

        // Flatten the left subtree
        flatten(root.left);

        // Move the flattened left subtree to the right
        root.right = root.left;
        root.left = null;

        // Find the last node of the new right subtree
        TreeNode lastNode = root;
        while (lastNode.right != null) {
            lastNode = lastNode.right;
        }

        // Flatten the original right subtree and attach it to the last node of the new right subtree
        flatten(rightChild);
        lastNode.right = rightChild;
    }
}
