class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] f=new int[26];
        for(char c:allowed.toCharArray()){
            f[c-'a']++;
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            String m=words[i];
            boolean flag=true;
            for(int j:m.toCharArray()){
                if(f[j-'a']==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                c++;
            }
        }
        return c;
    }
}