class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        backtrack(root, res, "");
        return res;
    }

    void backtrack(TreeNode root, List<String> res, String temp){
        
        if(root.left == null && root.right == null){
            res.add(temp + root.val);
            return;
        }
        if(root.left!=null) backtrack(root.left, res, temp + root.val + "->");
        if(root.right!=null) backtrack(root.right, res, temp + root.val + "->");
    }
}
