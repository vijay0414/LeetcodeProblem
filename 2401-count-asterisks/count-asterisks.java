class Solution {
    public int countAsterisks(String s) {
        int c=0;
        int or=0;
        for(char ch:s.toCharArray()){
            if(ch=='|' && c==0){
                c++;
            }else if(ch=='|' && c==1){
                c--;
            }
            if(ch=='*' && c==0){
                or++;
            }
        }
        return or;
    }
}