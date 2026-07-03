class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0,max = 0,c=0;
        List<Integer> list = new ArrayList<>();
        for(int r = 0;r < nums.length;r++){
            if(nums[r] != 0){
                list.add(nums[r]);
            }else{
                c++;
            }
            
            while(c > 1){
                if(nums[l] == 0){
                    c--;
                }
                list.clear();
                l++;
            }
            max = Math.max(max,r - l + 1);
        }
        return max - 1;
    }
}