class Solution {
    public int maxDistance(int[] colors) {
        int dif=0,maxi=0;
        for(int i=colors.length-1;i>=1;i--){
            if(colors[i]!=colors[0]){
                dif=i;
                break;
            }
        }
        int m=colors.length;
        for(int i=0;i<m-1;i++){
            if(colors[i]!=colors[m-1]){
                maxi=(m-1)-i;
                break;
            }
        }
        return Math.max(dif,maxi);
    }
}