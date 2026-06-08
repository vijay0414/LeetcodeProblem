class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int c=0;
        for(int i=0;i<s.length();i++){
            int z=0,o=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    o++;
                }else{
                    z++;
                }

                if(z<=k || o<=k){
                    c++;
                }
            }
        }
        return c;
    }
}