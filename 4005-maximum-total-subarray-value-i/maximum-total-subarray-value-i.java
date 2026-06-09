class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long c=0;
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        for(int i=0;i<k;i++){
            c+=(max-min);
        }
        return c;
    }
}