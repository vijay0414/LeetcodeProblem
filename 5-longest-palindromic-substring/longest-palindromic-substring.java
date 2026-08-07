class Solution {
    int st = 0;
    int max = 0;
    public String longestPalindrome(String s) {
        for(int i = 0 ;i < s.length();i++){
            expand(s,i,i);
            expand(s,i,i + 1);
        }
        return s.substring(st,max+st);
    }

    public  void expand(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        int len = right - left - 1;
        if(len > max){
            max = len;
            st = left + 1;
        }
    }
}