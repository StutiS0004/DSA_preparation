class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            st=st+ch;
        }
        st=st.toLowerCase();
        int right=st.length()-1;
        for(int i=0;i<right;i++)
        {
            if(st.charAt(i)!=st.charAt(right))
            return false;
            right--;
        }
        return true;
    }
}