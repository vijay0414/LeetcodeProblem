class Solution {
    public int passwordStrength(String password) {
        int sum =  0;
        Set<Character> s=new HashSet<>();
        for(char c:password.toCharArray()){
            s.add(c);
        }
        for(char c:s){
            if(c>='a' && c<='z'){
                sum+=1;
            }
            else if(c>='A' && c<='Z'){
                sum+=2;
            }else if(c>='0' && c<='9'){
                sum+=3;
            }else{
                sum+=5;
            }
        }
        return sum;
    }
}