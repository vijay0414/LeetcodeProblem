class Solution {
    public boolean isPowerOfTwo(int n) {
    //    int s=n;
    //    int p=0;
    //    while(n>1)
    //    {
    //       int d=n%2;
    //       if(d==0)
    //       {
    //         p++;
    //       }
    //       n=n/2;
    //    }
    //    return Math.pow(2,p)==s;

    return n > 0 && (n & (n-1)) == 0;
 
    }
}