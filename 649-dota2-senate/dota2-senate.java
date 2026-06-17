class Solution {
    public String predictPartyVictory(String s) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                q1.offer(i);
            }else{
                q2.offer(i);
            }
        }

        while(!q1.isEmpty() && !q2.isEmpty()){
            int r = q1.poll();
            int d = q2.poll();
            if(r<d){
                q1.offer(r+s.length());
            }else{
                q2.offer(d+s.length());
            }
        }  
        return q1.isEmpty()?"Dire" : "Radiant";
    }
}