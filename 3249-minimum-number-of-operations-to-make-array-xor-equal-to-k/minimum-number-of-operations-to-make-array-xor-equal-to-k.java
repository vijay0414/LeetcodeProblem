class Solution {
    public int minOperations(int[] nums, int k) {
        int n=0;
        for(int i:nums){
            n=n^i;
        }
        int c=0;
        while(k>0 || n>0){
            if((k%2)!=(n%2)){
                c++;
            }
            k/=2;
            n/=2;
        }
        return c;
    }
}