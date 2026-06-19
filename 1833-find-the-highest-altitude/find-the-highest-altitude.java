class Solution {
    public int largestAltitude(int[] g) {
        int[] n=new int[g.length+1];
        n[0]=0;
        int max=0;
        for(int i=1;i<=g.length;i++){
            n[i]=n[i-1]+g[i-1];
            if(n[i]>max){
                max=n[i];
            }
        }
        return max;
    }
}