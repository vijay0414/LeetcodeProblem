class Solution {
    public int xorBeauty(int[] nums) {
        int ans = 0;
        for(int i : nums){
            ans ^= i;
        }
        return ans;
        


        // Brute Force
        // int n =nums.length;
        // for(int i = 0 ; i < n;i++){
        //     for(int j = 0 ; j < n ; j++){
        //         for(int k = 0; k < n ;k++){
        //             int m = (nums[i] | nums[j]) & nums[k];
        //             ans ^= m;
        //         }
        //     }
        // }
        //return ans;
    }
}