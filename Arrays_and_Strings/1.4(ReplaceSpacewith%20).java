class Solution{
    public void replaceSpaces(char str[])
    {
        int len = str.length;
        int space=0, newLen, i;
        for(i=0; i<len; i++)
        {
            if(str[i]== ' ')
            {
                space++;
            }
        }

        newLen = len + (2*space);

        for(i=len-1; i>=0; i++)
        {
            if(str[i]==' ')
            {
                str[newLen-1] = '0';
                str[newLen-2] = '2';
                str[newLen-3] = '%';
                newLen = newLen - 3;
            }else{
                str[newLen-1] = str[i];
                newLen = newLen - 1;
            }
        }
    }
}
