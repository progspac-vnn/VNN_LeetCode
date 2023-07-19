class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int[] arrp = new int[26];
        int[] arrs = new int[26];
        ArrayList<Integer> arrlist = new ArrayList<>();

        for(int i=0; i<p.length(); i++)
        {
            arrp[p.charAt(i) - 'a']++;
        }

        int i = 0;
        for(int j=0; j<s.length(); j++)
        {
            arrs[s.charAt(j) - 'a']++;
            if(j == i+(p.length()-1))
            {
                if(Arrays.equals(arrs,arrp)){
                    arrlist.add(i);
                }
                arrs[s.charAt(i)-'a']--;
                i++;
            }
        }

        return arrlist;
    }
}
