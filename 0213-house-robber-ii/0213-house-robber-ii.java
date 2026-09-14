class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1)
        return nums[0];
        if(nums.length==2)
        return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int dp1[]=new int[n];
        dp1[0]=nums[0];
        dp1[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            dp1[i]=Math.max(nums[i]+dp1[i-2],dp1[i-1]);
        }
       // if(nums[0]!=nums[n-1])
        //return dp1[n-1];
        int skipLast=dp1[n-2];
        int dp[]=new int[n-1];
        dp[0]=nums[1];
        dp[1]=Math.max(nums[1],nums[2]);
        for(int i=2;i<n-1;i++)
        {
            dp[i]=Math.max(nums[i+1]+dp[i-2],dp[i-1]);
        }
        int skipFirst=dp[n-2];
        return Math.max(skipFirst,skipLast);
    }
}