class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==goal){
        //             c++;
        //         }
        //     }
        // }
        // return c;

        // int sum=0,l=0,count=0;
        // for(int r=0;r<nums.length;r++){
        //     sum+=nums[r];
        //     while(sum>goal){
        //         sum-=nums[l];
        //         l++;
        //     }
        //     if(sum==goal){
        //         count++;
        //     }
        // }
        // return count;

        HashMap<Integer,Integer> m=new HashMap<>();
        int prefsum=0;
        int count = 0;
        m.put(0,1);
        for(int i:nums){
            prefsum+=i;
            if(m.containsKey(prefsum-goal)){
                count+=m.get(prefsum-goal);
            }
            m.put(prefsum , m.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
}