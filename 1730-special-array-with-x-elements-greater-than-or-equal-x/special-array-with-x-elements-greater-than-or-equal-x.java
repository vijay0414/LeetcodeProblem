class Solution {
    public int specialArray(int[] nums) {
        for(int i = 1 ; i <= nums.length;i++){
            int c = 0;
            for(int j = 0;j < nums.length;j++){
                if(i <= nums[j]) c++;
            }
            if(c == i) return c;
        }
        return -1;
    }
}