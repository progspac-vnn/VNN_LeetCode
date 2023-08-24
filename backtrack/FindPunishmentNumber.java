class Solution {
    public int punishmentNumber(int n) {
        int res=0;
        for(int i=2;i<=n;i++){
            if(isPos(i,i*i,0,10)){
                res +=(i*i);
            }
            
        }
        return ++res;
    }
    
    public boolean isPos(int i, int val,int temp,int div){
        if((val+temp)==i)return true;
        if(val==0) return false;
        while(div<val){
            if(isPos(i,val/div,temp+(val%div),10)) return true;
            div *=10;
        }
        return false;
        
        
    }
}
