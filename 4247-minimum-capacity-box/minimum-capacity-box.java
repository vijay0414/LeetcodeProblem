class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int inmin = -1,min = Integer.MAX_VALUE;
        for(int i = 0 ;i < capacity.length ;i++){
            if(capacity[i] >= itemSize){
                if(min > capacity[i]){
                    inmin = i;
                    min = capacity[i]; 
                }
            }
        }
        return inmin;
    }
}