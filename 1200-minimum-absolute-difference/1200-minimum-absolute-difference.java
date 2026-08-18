class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        int diff,mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            diff=arr[i]-arr[i-1];
            if(diff<mindiff)
            mindiff=diff;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]==mindiff)
            {
                List<Integer> list1=new ArrayList<>();
                list1.add(arr[i-1]);
                list1.add(arr[i]);
                list.add(list1);
            }
            
        }
        return list;
    }
}