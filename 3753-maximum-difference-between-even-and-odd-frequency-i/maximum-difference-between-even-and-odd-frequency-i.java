class Solution {
    public int maxDifference(String s) {
        int[] n=new int[26];
        for(int i=0;i<s.length();i++){
            n[s.charAt(i)-'a']++;
        }
        int odd=0,even=s.length();
        for(int i=0;i<26;i++){
            if(n[i]%2==0 && n[i]>0){
                even=Math.min(even,n[i]);
            }
            if(n[i]%2!=0){
                odd=Math.max(odd,n[i]);
            }
        }
        return odd-even;
    }
}