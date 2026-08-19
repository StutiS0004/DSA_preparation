class Solution {
    public String replaceDigits(String s) {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            st=st+s.charAt(i);
            else
            {
                st=st+(char)(Character.getNumericValue(s.charAt(i))+(s.charAt(i-1)));
            }
        }
        return st;
    }
}