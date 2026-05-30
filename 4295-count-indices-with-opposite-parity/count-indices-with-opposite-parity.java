class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int o=0,e=0;
        int[] m=new int[n];
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2==0){
                m[i]=o;
                e++;
            }else{
                m[i]=e;
                o++;
            }
        }
        return m;
    }
}