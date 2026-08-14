class Solution {
    public double averageWaitingTime(int[][] c) {
        long n=c[0][0]+c[0][1];
        long dif=n-c[0][0];
        for(int i=1;i<c.length;i++){
            long st=Math.max(n,c[i][0]);
            long s=st+c[i][1];
            long dif1=s-c[i][0];
            dif+=dif1;
            n=s;
        }
        return (double)dif/c.length;
    }
}