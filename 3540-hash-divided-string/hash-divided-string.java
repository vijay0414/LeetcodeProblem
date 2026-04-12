class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            for(int j=i;j<Math.min(i+k,s.length());j++){
                sum+=s.charAt(j)-'a';
            }
            char c=(char)(sum%26+'a');
            sb.append(c);
        }
        return sb.toString();
    }
}