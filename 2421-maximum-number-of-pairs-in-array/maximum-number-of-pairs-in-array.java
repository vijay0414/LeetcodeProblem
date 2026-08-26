class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        int left = 0;
        int pairs = 0;
        for(int i : nums){
            freq[i]++;
        }
        for (int count : freq) {
            pairs += count / 2;      
            left += count % 2;
        }
   
        return new int[]{pairs,left};
    }
}