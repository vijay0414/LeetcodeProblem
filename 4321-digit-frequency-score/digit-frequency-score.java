class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}