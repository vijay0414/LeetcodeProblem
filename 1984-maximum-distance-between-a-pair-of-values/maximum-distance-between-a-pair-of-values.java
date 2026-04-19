class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxi=0,i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                maxi=Math.max(maxi,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxi;
    }
}