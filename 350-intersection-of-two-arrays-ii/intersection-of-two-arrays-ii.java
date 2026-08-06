class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> m1 = new HashMap<>();
        // HashMap<Integer,Integer> m2 = new HashMap<>();

        for(int i : nums1){
            m1.put(i,m1.getOrDefault(i,0) + 1);
        }
        List<Integer> lsit = new ArrayList<>();
        for(int i : nums2){
            if(m1.containsKey(i)){
                int val = m1.get(i);
                if(val > 0){
                    lsit.add(i);
                    m1.put(i,m1.getOrDefault(i,0) - 1);
                }
               
            }
        }
        int t = 0;
        int[] arr = new int[lsit.size()];
        for(int i : lsit){
            arr[t++] = i;
        }
        return arr;
    }
}