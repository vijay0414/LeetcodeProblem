class Solution {
    public int numberOfSpecialChars(String word) {
        int[] up=new int[26];
        int[] lo=new int[26];
        for(char c:word.toCharArray()){
            if(c>='a' && c<='z'){
                lo[c-'a']++;
            }else{
                up[c-'A']++;
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(up[i]!=0 && lo[i]!=0){
                c++;
            }
        }
        return c;
    }
}