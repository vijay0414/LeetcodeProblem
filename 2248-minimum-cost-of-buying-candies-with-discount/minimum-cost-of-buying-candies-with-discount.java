class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0,n=cost.length;
        for(int i=0;i<n;i+=3){
            sum+=cost[n-1-i];
            if(i+1<n){
                sum+=cost[n-1-(i+1)];
            }
        }
        return sum;
    }
}