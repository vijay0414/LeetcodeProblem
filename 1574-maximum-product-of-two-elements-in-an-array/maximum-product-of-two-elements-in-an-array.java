class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int n=(nums[a-2]-1)*(nums[a-1]-1);
        return n;
    }
}