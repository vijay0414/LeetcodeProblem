class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        for(int[] i : queries){
            int l = i[0], r =i[1] , k = i[2] , v = i[3];
            for(int j = l ; j <= r;j = j + k){
                nums[j] = (int)((1L * nums[j] * v) % mod);
            }
        }

        int n = 0;
        for(int i : nums){
            n ^= i;
        }
        //System.out.println(Arrays.toString(nums));
        return n;
    }
}