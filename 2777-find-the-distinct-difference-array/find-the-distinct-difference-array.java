class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Set<Integer> s=new HashSet<>();
            Set<Integer> s1=new HashSet<>();
            for(int j=0;j<=i;j++){
                s.add(nums[j]);
            }
            for(int k=i+1;k<nums.length;k++){
                s1.add(nums[k]);
            }
            n[i]=s.size()-s1.size();
        }
        return n;
    }
}