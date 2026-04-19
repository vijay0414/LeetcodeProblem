class Solution {
    public int[] findArray(int[] pref) {
        int[] n=new int[pref.length];
        n[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            n[i]=pref[i]^pref[i-1];
        }
        return n;
    }
}