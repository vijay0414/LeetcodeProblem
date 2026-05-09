class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
       while(i<s.length()){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
                String m=s.substring(i,i+2);
                int n=Integer.parseInt(m);
                char c=(char)('a'+n-1);
                sb.append(c);
                i=i+3;
            }else{
                int n=s.charAt(i)-'0';
                char c=(char)('a'+n-1);
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}