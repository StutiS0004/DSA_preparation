class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int s=0,tot=0;
        
        for(int i:nums)
        s=s+i;
        if (Math.abs(target) > s)
    return 0;

if ((s + target) % 2 != 0)
    return 0;
        tot=(target+s)/2;
        int[] dp = new int[tot + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = tot; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }
        return dp[tot];


    }
}