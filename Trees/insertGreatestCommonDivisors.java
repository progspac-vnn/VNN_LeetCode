class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode prev = new ListNode();
        ListNode cur = new ListNode();
        int[] gcd = new int[5000];
        int test = 0;
        prev=head;
        cur = head.next;
        while(cur!=null){
            int x=prev.val,y=cur.val;
            
            int j=0;
            for(int i=1; i<=x && i<=y; i++){
                if(x%i==0 && y%i==0){
                    // gcd[j]=i;
                    test=i;
                }
            }
            
            ListNode newNode = new ListNode(test);
            prev.next = newNode;
            newNode.next = cur;
            
            prev = newNode.next;
            cur = cur.next;
            
        }
        
        return head;
        
    }
}
