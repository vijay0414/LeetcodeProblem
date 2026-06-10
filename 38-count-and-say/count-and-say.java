class Solution {
    public String countAndSay(int n) {
        String res="1";
        if(n==1){
            return "1";
        }
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int c=1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    c++;
                }else{
                    sb.append(c).append(res.charAt(j-1));
                    c=1;
                }
            }
            sb.append(c);
            sb.append(res.charAt(res.length()-1));
            res=sb.toString();
        }
        return res;
    }
}