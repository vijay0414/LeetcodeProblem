class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws ,int[] wd) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<ls.length;i++){
            for(int j=0;j<ws.length;j++){
                int lf=ls[i]+ld[i];
                int fin1=Math.max(lf,ws[j])+wd[j];

                int wf=ws[j]+wd[j];
                int fin2=Math.max(wf,ls[i])+ld[i];

                ans=Math.min(ans,fin1);
                ans=Math.min(ans,fin2);
            }
        }
        return ans;
    }
}