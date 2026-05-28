class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]>=nums[i]){
                return i;
            }
        }
        return 0;
    }
}