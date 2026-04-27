class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        num/=3;
        long[] m=new long[3];
        m[0]=num-1;
        m[1]=num;
        m[2]=num+1;
        return m;
    }
}