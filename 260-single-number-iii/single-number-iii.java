class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i : nums){
            m.put(i,m.getOrDefault(i,0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int i : m.keySet()){
            if(m.get(i) == 1) list.add(i);
        }

        int[] a = new int[list.size()];
        int t = 0;
        for(int i : list) {
            a[t++] = i;
        }
        return a;
    }
}