class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int i = 0 ; i < c.length ; i += (k+k)){
            int st = i;
            int end = Math.min(i + k - 1 , c.length - 1);
            while(st < end){
                char ch = c[st];
                c[st] = c[end];
                c[end] = ch;
                st++;
                end--;
            }
        }
        return new String(c);
    }
}