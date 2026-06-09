class Solution {
    public int candy(int[] rat) {
        int c=0;
        int[] n=new int[rat.length];
        n[0]=1;
        for(int i=1;i<rat.length;i++){
            if(rat[i]>rat[i-1]){
                n[i]=n[i-1]+1;
            }else{
                n[i]=1;
            }
        }
        int[] m=new int[rat.length];
        m[m.length-1]=1;
        for(int i=rat.length-2;i>=0;i--){
            if(rat[i]>rat[i+1]){
                m[i]=m[i+1]+1;
            }else{
                m[i]=1;
            }
        }
        for(int i=0;i<rat.length;i++){
            c+=Math.max(m[i],n[i]);
        }
        return c;

    }
}