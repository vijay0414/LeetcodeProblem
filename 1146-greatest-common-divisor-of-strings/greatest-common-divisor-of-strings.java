class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int n = str1.length(),m = str2.length();
       if(!(str1 + str2).equals(str2 + str1)) return "";
       while(m != 0){
            int t = m;
            m = n % m;
            n = t;
       }

       return str1.substring(0,n);
    }
}