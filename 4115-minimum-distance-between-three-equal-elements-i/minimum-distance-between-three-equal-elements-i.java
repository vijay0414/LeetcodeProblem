class Solution {
    public int minimumDistance(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1;k<nums.length;k++){
                        if(nums[j]==nums[k]){
                            mini=Math.min(mini,2*(k-i));
                        }
                    }
                }
            }
        }
        if(mini==Integer.MAX_VALUE){
            return -1;
        }
        return mini;
    }
}