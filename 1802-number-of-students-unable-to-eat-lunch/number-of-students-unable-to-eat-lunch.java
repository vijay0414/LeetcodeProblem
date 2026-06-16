class Solution {
    public int countStudents(int[] s, int[] san) {
        Queue<Integer> qu = new LinkedList<>();
        for(int i:s){
            qu.offer(i);
        }

        int c=0,in=0;
        while(!qu.isEmpty() && c<=qu.size()){
            if(qu.peek() == san[in]){
                qu.poll();
                in++;
                c=0;
            }else{
                qu.offer(qu.poll());
                c++;
            }
        }
        return qu.size();
    }
}