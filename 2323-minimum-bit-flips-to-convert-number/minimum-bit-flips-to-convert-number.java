class Solution {
    public int minBitFlips(int s, int g) {
        int c=0;
        String n=Integer.toString(s,2);
        String m=Integer.toString(g,2);
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        if(n.length()>m.length()){
            for(int i=0;i<n.length()-m.length();i++){
                sb1.append('0');
            }
        }
        if(m.length()>n.length()){
            for(int i=0;i<m.length()-n.length();i++){
                sb.append('0');
            }
        }
        sb.append(n);
        sb1.append(m);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb1.charAt(i)){
                c++;
            }
        }
        return c;
    }
}