class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int[] n=new int[t.length];
        for(int i=t.length-1;i>=0;i--){
            while(!st.isEmpty() && t[i]>=t[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                n[i]=st.peek()-i;
            }
            st.push(i);
        }
        return n;
    }
}