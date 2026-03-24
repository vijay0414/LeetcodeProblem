class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        return sum(f)+sum(s)==sum(t);
    }
    public static int sum(String n){
        int num=0;
        for(char c:n.toCharArray()){
            num=num*10+(c-'a');
        }
        return num;
    }
}