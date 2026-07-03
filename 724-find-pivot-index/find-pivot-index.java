class Solution {
    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length+1];
        int[] right = new int[nums.length+1];
        left[0] = 0;
        right[nums.length] = 0;
        for(int i = 0; i < nums.length;i++){
            left[i+1] = left[i] + nums[i];
        }
        for(int i = nums.length-1; i >= 0; i--){
            right[i] = right[i+1] + nums[i];
        }
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        for(int i = 0;i < nums.length;i++){
            if(left[i] == right[i+1]){
                return i;
            }
        }
        return -1;
    }
}