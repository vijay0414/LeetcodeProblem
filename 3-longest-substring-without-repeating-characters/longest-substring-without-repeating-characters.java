class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        // int l=0;
        // Set<Character> m=new HashSet<>();
        // for(int r=0;r<s.length();r++){
        //     while(m.contains(s.charAt(r))){
        //         m.remove(s.charAt(l));
        //         l++;
        //     }
        //     m.add(s.charAt(r));
        //     max=Math.max(max,r-l+1);
        // }
        // return max;
        for(int i=0;i<s.length();i++){
            String s1="";
            for(int j=i;j<s.length();j++){
                if(!(s1.contains(String.valueOf(s.charAt(j))))){
                    s1+=s.charAt(j);
                    max = Math.max(max, s1.length());
                }else{
                   break;
                }
            }
        }
        return max;
    }
}