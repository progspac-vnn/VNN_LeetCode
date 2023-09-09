class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        rec(0,res, temp, s);
        return res;
    }

    void rec(int idx, List<List<String>> res, List<String> temp, String s){
        if(idx == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=idx; i<s.length(); i++){
            if(isPal(s, idx, i)){
                temp.add(s.substring(idx, i+1));
                rec(i+1, res, temp, s);
                temp.remove(temp.size()-1);
            }
        }
    }

    boolean isPal(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }   

}
