class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int[] m=new int[q.length];
        int t=0;
        int esum=0;
        for(int i:nums){
            if(i%2==0){
            esum+=i;
            }
        }
        for(int i=0;i<q.length;i++){
            int val=q[i][0];
            int in=q[i][1];
            if(nums[in]%2==0){
                esum-=nums[in];
            }
            nums[in]+=val;
            if(nums[in]%2==0){
                esum+=nums[in];
            }
            m[t++]=esum;
        }
        return m;
    }
}