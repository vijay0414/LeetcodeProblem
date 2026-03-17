class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int m=nums1[i];
            int in=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    in=j;
                    break;
                }
            }
            for(int k=in;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    nums1[i]=nums2[k];
                    break;
                }
            }
            if(nums1[i]==m){
                nums1[i]=-1;
            }
        }
        return nums1;
    }
}