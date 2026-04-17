class Solution {
    public long gcdSum(int[] nums) {
        int[] m=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            //max=Math.max(max,nums[i]);
            m[i]=gcd(nums[i],max);
        }
        Arrays.sort(m);
        int j=0,k=m.length-1;
        long sum=0;
        while(j<k){
            sum+=gcd(m[j],m[k]);
            j++;
            k--;
        }
        return sum;
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}