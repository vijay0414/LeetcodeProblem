class Solution {
    public boolean isBalanced(String num) {
        int even=0,odd=0;
        for(int i=0;i<num.length();i++){
            int n=num.charAt(i)-'0';
            if(i%2==0){
                even+=n;
            }else{
                odd+=n;
            }
        }
        return even==odd;
    }
}