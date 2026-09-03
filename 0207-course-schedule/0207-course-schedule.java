class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
            adj.add(new ArrayList<>());

        }
        int indegree[]=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(u).add(v);
            indegree[v]++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }
        while(!q.isEmpty())
        {
            int vertex=q.remove();
            ans.add(vertex);
            for(int ele:adj.get(vertex))
            {
                if(indegree[ele]!=0)
                {
                    indegree[ele]--;
                    if(indegree[ele]==0)
                    q.add(ele);
                }
            }
        }
        if(ans.size()!=numCourses)
        return false;
        return true;
    }
}