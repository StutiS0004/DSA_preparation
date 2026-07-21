class Solution {
    public long[] sumOfThree(long num) {
        long nums[]=new long[3];
        if(num%3!=0)
        return new long[0];
        else
        {
            nums[1]=num/3;
            nums[0]=nums[1]-1;
            nums[2]=nums[1]+1;
            return nums;
        }
    }
}