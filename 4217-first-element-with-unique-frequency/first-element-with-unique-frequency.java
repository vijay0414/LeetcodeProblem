class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> m1 = new LinkedHashMap<>();
        HashMap<Integer,Integer> m2 = new LinkedHashMap<>();

        for(int i : nums){
            m1.put(i,m1.getOrDefault(i,0) + 1);
        }

        for(int i : m1.keySet()){
            m2.put(m1.get(i) , m2.getOrDefault(m1.get(i) , 0) + 1);
        }

        for(int i : nums){
            if(m2.get(m1.get(i)) == 1) return i;
        }
        return -1;

    }
}