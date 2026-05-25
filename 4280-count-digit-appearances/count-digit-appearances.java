class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n!=0){
                int d=n%10;
                if(d==digit){
                    c++;
                }
                n/=10;
            }
        }
        return c;
    }
}