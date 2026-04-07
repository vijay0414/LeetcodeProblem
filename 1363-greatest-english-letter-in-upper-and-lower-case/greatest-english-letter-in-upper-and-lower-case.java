class Solution {
    public String greatestLetter(String s) {
        int[] n=new int[26];
        int[] m=new int[26];
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                n[c-'a']++;
            }else{
                m[c-'A']++;
            }
        }
        for(int i=25;i>=0;i--){
            if(n[i]>=1 && m[i]>=1){
                return String.valueOf((char)(i+'A'));
            }
        }
        return "";
    }
}