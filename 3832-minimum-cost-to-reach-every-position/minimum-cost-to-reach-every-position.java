class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans=new int[cost.length];
        ans[0]=cost[0];
        for(int i=1;i<cost.length;i++){
            if(cost[i]>ans[i-1]){
                ans[i]=ans[i-1];
            }else{
                ans[i]=cost[i];
            }
        }
        return ans;
    }
}