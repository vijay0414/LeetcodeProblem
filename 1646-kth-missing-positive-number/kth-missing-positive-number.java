class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] m=new int[2001];
        for(int i:arr)
        {
            m[i]++;
        }
        int j=0;
        for(int i=1;i<m.length;i++){
            if(m[i]==0){
                j++;
                if(j==k){
                    return i;
                }
            }
        }
        return -1;
    }
}