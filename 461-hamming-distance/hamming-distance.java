class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        String s=Integer.toString(x,2);
        String n=Integer.toString(y,2);
        int max=Math.max(s.length(),n.length());
        while(s.length()<max){
            s='0'+s;
        }
        while(n.length()<max){
            n='0'+n;
        }
        for(int i=0;i<max;i++){
            if(s.charAt(i)!=n.charAt(i)){
                c++;
            }
        }
        return c;
    }
}