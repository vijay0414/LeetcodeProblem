class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMost(nums,k) - atMost(nums,k-1);
    }
    public static int atMost(int[] nums,int k){
        HashMap<Integer,Integer> m=new HashMap<>();
        int l=0,count=0;
        for(int r=0;r<nums.length;r++){
            m.put(nums[r],m.getOrDefault(nums[r],0)+1);
            while(m.size()>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}