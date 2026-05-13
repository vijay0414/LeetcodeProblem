class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> n=new ArrayList<>();
        int m=0;
        for(int i=0;i<nums.length;i++){
            m=(m*2+nums[i])%5;
            n.add(m==0);
        }
        return n;
    }
}