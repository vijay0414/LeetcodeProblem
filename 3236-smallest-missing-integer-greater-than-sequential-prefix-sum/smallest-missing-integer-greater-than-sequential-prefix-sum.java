class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for(int i = 1;i < nums.length ; i++){
            if(nums[i] == nums[i - 1] + 1) sum += nums[i];
            else break;
        }
        Set<Integer> st = new HashSet<>();
        for(int i : nums) {
           st.add(i);
        }
        while(st.contains(sum)){
            sum += 1;
        }
        return sum;
    }
}