class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> n=new ArrayList<>();
        Arrays.sort(nums);
        int[] m=new int[101];
        for(int i:nums){
            m[i]++;
        }

        for(int i=nums[0];i<nums[nums.length-1];i++){
            if(m[i]==0){
                n.add(i);
            }
        }
        return n;
    }
}