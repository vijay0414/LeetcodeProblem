class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> m=new HashSet<>();
        for(int i:nums){
            if(i%k==0){
                m.add(i);
            }
        }
        for(int i=k;;i+=k){
            if(!m.contains(i)){
                return i;
            }
        }
    }
}