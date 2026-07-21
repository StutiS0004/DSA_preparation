class Solution {
    public long countDistinct(long n) {
        HashSet<Long> set=new HashSet<>();
        /*for(long i=1;i<=n;i++)
        {
            String s=Long.toString(i);
            
            s=s.replaceAll("0","");
            set.add(Long.parseLong(s));

        }*/
        String s=Long.toString(n);
        int l=s.length();
        long sum=0;
        if(l==1)
        return n;
        for(int i=1;i<l;i++)
        {
            sum=sum+(long)Math.pow(9,i);
        }
        int count=0;
       for(int i=0;i<l;i++)
       {
        int k=s.charAt(i)-'0';
        if(k>=1)
        {
            sum=sum+((k-1)*(long)Math.pow(9,l-i-1));
        }
        if(k==0)
        break;

       }

         /*   for(long j=(long)Math.pow(10,l-1)+1;j<=n;j++)
        {
            
            String s1=Long.toString(j);
            if(s1.startsWith("10"))
            break;
            if(s1.indexOf("0")==-1)
            count++;
            
        }
        sum=sum+ count;
        */
        if(s.indexOf('0')==-1)
        sum+=1;
        return sum;

    }
}