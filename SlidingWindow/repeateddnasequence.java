class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        if (len <= 10) {
            return new ArrayList<>();
        }

        Set<String> set1 = new HashSet<>();
        Set<String> ans = new HashSet<>();
        List<String> list = new ArrayList<>();

        int i = 0, j = 10;

        while (j <= len) {
            String ss = s.substring(i, j);

            if (set1.contains(ss)) {
                ans.add(ss);
            } else {
                set1.add(ss);
            }

            i++;
            j++;
        }

        list.addAll(ans);
        return list;
    }
}
