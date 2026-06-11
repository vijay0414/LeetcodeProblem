class Solution {
    public String convert(String s, int num) {
        boolean flag=false;
        if(num==1 || s.length()<=num){
            return s;
        }
        StringBuilder n[]=new StringBuilder[num];
        for(int i=0;i<num;i++){
            n[i]=new StringBuilder();
        }
        int curr=0;
        for(char c:s.toCharArray()){
            n[curr].append(c);
            if(curr == 0 || curr == num-1){
                flag=!flag;
            }
            curr+=flag?1:-1;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder r:n){
            sb.append(r);
        }
        return sb.toString();
    }
}