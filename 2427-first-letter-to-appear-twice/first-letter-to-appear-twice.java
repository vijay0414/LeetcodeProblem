class Solution {
    public char repeatedCharacter(String s) {
       int[] n=new int[26];
       for(char i:s.toCharArray()){
        n[i-'a']++;
        if(n[i-'a']==2){
            return i;
        }
       }
       return '0';

    }
}