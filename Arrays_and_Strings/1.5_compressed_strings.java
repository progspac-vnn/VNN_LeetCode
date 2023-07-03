class Solution {
    public int compress(char[] chars) {
        int i=0,j=0;
        int n =chars.length;
       while(i<n)
       {
           char current = chars[i];
           int count = 0;

            while(i<n && chars[i]==current)
            {
                i++;
                count++;
            }

            // compress
            chars[j++] = current;
            if(count>1){
                String countStr = String.valueOf(count);
                for(char c:countStr.toCharArray()) // This for loop is for when count is two digit
                {
                    chars[j]=c;
                    j++;
                }
            }
            
       }
       return j;
    }
}
