class Solution {
    public int countGoodSubstrings(String s) {
       int c=0;
       for(int i=0;i<=s.length()-3;i++){
        Set<Character> m=new HashSet<>();
        for(int j=i;j<i+3;j++){
            m.add(s.charAt(j));
        }
        if(m.size()==3){
            c++;
        }
       }
       return c;
    }
}