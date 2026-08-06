class Solution {
    public String clearDigits(String s) {
    //    StringBuilder sb=new StringBuilder();
    //    for(char c:s.toCharArray()){
    //     if(Character.isDigit(c)){
    //         if(sb.length()>0){
    //             sb.deleteCharAt(sb.length()-1);
    //         }
    //     }else{
    //             sb.append(c);
    //         }
    //    }
    //    return sb.toString();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Character.isDigit(c)){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}