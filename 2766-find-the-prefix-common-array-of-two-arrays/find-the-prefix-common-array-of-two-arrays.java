class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] freq=new int[a.length+1];
        int[] n=new int[a.length];
        int c=0;
        for(int i=0;i<a.length;i++){
            if(++freq[a[i]]==2){
                c++;
            }
            if(++freq[b[i]]==2){
                c++;
            }
            n[i]=c;
        }
        return n;
    }
}