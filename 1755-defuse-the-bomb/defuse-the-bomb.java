class Solution {
    public int[] decrypt(int[] code, int k) {
        int m=code.length;
        int[] n=new int[m];
       if(k==0){
        return n;
       }
       for(int i=0;i<m;i++){
        int sum=0;
        if(k>0){
            for(int j=i+1;j<i+1+k;j++){
                sum+=code[j%m];
            }
        }else{
            for(int j=i-1;j>i-1-Math.abs(k);j--){
                sum+=code[((j%m)+m)%m];
            }
        }
        n[i]=sum;
       }
        return n;
    }
}