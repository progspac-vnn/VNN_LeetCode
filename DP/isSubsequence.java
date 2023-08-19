class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() == 0 && s.length() == 0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        

        for(int i=0; i<s.length(); i++){
            int j = 0;
            if(t.length()==0){
                return false;
            }
            while(j<t.length()){
                if(j==t.length()-1 && s.charAt(i) != t.charAt(j)){
                    return false;
                }
                if(s.charAt(i) == t.charAt(j)){
                    t = t.substring(j+1, t.length());
                    System.out.println(t);
                    break;
                }
                j++;
            }
        }

        return true;
    }
}
