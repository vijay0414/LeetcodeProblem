class Solution {
    public int numOfPairs(String[] nums, String target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                StringBuilder s=new StringBuilder(nums[i]);
                s.append(nums[j]);
                if(s.toString().equals(target)){
                    c++;
                }
            }
            }
        }
        return c;
    }
}