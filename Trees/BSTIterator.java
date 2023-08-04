class BSTIterator {

    Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    
    public int next() {
        TreeNode res = st.pop();
        TreeNode cur = res.right;
        while(cur!=null){
            st.push(cur);
            cur = cur.left;
        }
        return res.val;
    }
    
    public boolean hasNext() {
        return (!st.isEmpty());
    }
}
