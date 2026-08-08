class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length - 1 ;i++){
            int diff = Math.abs(nums[i] - nums[i+1]);
            if(diff > max) max = diff;
        }

        int dif = Math.abs(nums[nums.length - 1 ] - nums[0]);
        if(dif > max){
            return dif;
        }
        return max;
    }
}