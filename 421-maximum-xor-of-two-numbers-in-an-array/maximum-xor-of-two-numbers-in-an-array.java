class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        int mask = 0;
        for(int i = 31;i >= 0;i--){
            mask = mask | (1 << i);
            Set<Integer> st = new HashSet<>();
            for(int j : nums){
                st.add(mask & j);
            }

            int can = max | (1 << i);
            for(int t : st){
                if(st.contains(t ^ can)){
                    max = can;
                    break;
                }
            }
        }
        return max;
    }
}