// Handling 64bit overflow exception

class Solution {
    public int reverse(int x) {
        boolean isNeg = false;

        if(x<0){
            isNeg=true;
            x = Math.abs(x);
        }

        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String reversedString = new String(chars);
        try{
            int res = Integer.parseInt(reversedString);
            return isNeg ? -res : res;
        } catch(NumberFormatException e){
            return 0;
        }
        
        
        
    }
}
