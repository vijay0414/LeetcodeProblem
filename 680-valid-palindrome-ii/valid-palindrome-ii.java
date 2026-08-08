class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else {
                return isPlain(s,l + 1,r) || isPlain(s,l,r - 1);
            }
        }
        return true;
    }

    public boolean isPlain(String s,int l, int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}