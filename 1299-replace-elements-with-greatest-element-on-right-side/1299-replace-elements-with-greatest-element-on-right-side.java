class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            max=Math.max(arr[i+1],max);
            ans[i]=max;
        }
        return ans;
    }
}