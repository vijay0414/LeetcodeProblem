class Solution {
    public int pivotInteger(int n) {
        int t=n*(n+1)/2;
        int sum=0;
       for (int j=1;j<=n;j++) {
            sum+=j;                 
            int right=t-sum+j;
            if (sum==right) {
                return j;
            }
        }
        return -1;
    }
}