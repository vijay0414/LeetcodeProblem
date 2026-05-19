class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:nums1){
            h1.add(i);
        }
        for(int i:nums2){
            if(h1.contains(i)){
                return i;
            }
        }
        return -1;
    }
}