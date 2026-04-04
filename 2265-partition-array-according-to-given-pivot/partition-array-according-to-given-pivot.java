class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // List<Integer> n=new ArrayList<>();
        // List<Integer> m=new ArrayList<>();
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>pivot){
        //         n.add(nums[i]);
        //     }else if(nums[i]==pivot){
        //         c++;
        //     }
        //     else{
        //         m.add(nums[i]);
        //     }
        // }
        // List<Integer> res=new ArrayList<>();
        // for(int i:m){
        //     res.add(i);
        // }
        // for(int i=0;i<c;i++){
        //     res.add(pivot);
        // }
        // for(int i:n){
        //     res.add(i);
        // }
        // int j=0;
        // for(int i:res){
        //     nums[j++]=i;
        // }
        // return nums;
        int[] n=new int[nums.length];
        int l=0;
        for(int i:nums){
            if(i<pivot){
                n[l++]=i;
            }
        }
        for(int i:nums){
            if(i==pivot){
                n[l++]=i;
            }
        }
        for(int i:nums){
            if(i>pivot){
                n[l++]=i;
            }
        }
        return n;
    }
}