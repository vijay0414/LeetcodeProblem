class Solution {
    public int maxArea(int[] n) {
       int l=0,r=n.length-1,max=0;
       while(l<r){
            int high=Math.min(n[l],n[r]);
            int len=r-l;
            int area=len*high;
            max=Math.max(max,area);
            if(n[l]<n[r]){
                l++;
            }else{
                r--;
            }
       }
       return max;
    }
}