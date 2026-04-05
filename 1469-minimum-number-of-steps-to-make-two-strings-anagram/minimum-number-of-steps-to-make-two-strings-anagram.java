class Solution {
    public int minSteps(String s, String t) {
        int[] n=new int[26];
        int[] m=new int[26];
        for(char c : s.toCharArray()){
            n[c-'a']++;
        }
        for(char c : t.toCharArray()){
            m[c-'a']++;
        }
        int a=0;
        for(int i=0;i<26;i++){
            if(m[i]<n[i]){
                a+=Math.abs(m[i]-n[i]);
            }
        }
        return a;
    }
}