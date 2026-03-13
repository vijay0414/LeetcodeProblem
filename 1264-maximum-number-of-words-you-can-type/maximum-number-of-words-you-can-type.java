class Solution {
    public int canBeTypedWords(String text, String b) {
        int c=0;
        String[] s=text.split("\\s+");
        for(String i:s){
            boolean n=true;
            for(int j=0;j<b.length();j++){
                if(i.contains(b.charAt(j)+"")){
                    n=false;
                    break;
                }
            }
            if(n){
                c++;
            }
        }
        return c;
    }
}