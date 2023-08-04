class BSTIterator {

    Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        while(root!=null){
            st.push(root);  // Get the leftmost node(Inorder)
            root=root.left;
        }
    }
    
    public int next() {
        TreeNode res = st.pop();
        TreeNode cur = res.right; // Check if any right child exists?
        while(cur!=null){
            st.push(cur);  // Get the leftmost node(Inorder) [Same logic as that of the BSTIterator in the constructor]
            cur = cur.left; 
        }
        return res.val;
    }
    
    public boolean hasNext() {
        return (!st.isEmpty()); // if stack is Empty there is no right child
    }
}
