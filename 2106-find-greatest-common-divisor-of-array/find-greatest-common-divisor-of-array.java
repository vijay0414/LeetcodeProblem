class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        int b=nums[0];
        int n=1;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                n=i;
            }
        }
        return n;
    }
}