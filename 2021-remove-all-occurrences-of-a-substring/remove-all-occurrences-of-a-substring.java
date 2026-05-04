class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            int in=sb.indexOf(part);
            sb.delete(in,in+part.length());
        }
        return sb.toString();
    }
}