class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        if(nums.length!=max+1){
            return false;
        }
        int[] n=new int[max+1];
        for(int i:nums){
            if(i<1 || i>max){
                return false;
            }
            n[i]++;
        }
        for(int i=1;i<max;i++){
            if(n[i]!=1){
                return false;
            }
        }
        return n[max]==2;
    }
}