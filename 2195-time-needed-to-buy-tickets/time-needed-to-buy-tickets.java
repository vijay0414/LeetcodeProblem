class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++){
            q.offer(i);
        }
        
        int i = 0;
        while(!q.isEmpty()) {
            i++;
            int in = q.poll();
            tickets[in]--;
            if(in == k && tickets[in] == 0){
                return i;
            }
            if(tickets[in] != 0){
                q.offer(in);
            }
        }
        return i;
    }
}