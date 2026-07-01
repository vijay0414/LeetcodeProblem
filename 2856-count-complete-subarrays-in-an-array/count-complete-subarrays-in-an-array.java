class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int n = set.size();
        int  c = 0;
        for(int r = 0;r < nums.length;r++){
            Set<Integer> set1  = new HashSet<>();
            for(int j = r;j < nums.length;j++){
                set1.add(nums[j]);
                if(set1.size() == n){
                c++;
            }
            }
            
        }
        return c;
    }
}