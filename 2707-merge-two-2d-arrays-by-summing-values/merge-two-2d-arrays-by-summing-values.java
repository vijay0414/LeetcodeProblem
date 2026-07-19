class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int[] n : nums1){
            int i = n[0];
            int j = n[1];
            map.put(i,map.getOrDefault(i,0) + j);
        }
        
        for(int[] n : nums2){
            int i = n[0];
            int j = n[1];
            map.put(i,map.getOrDefault(i,0) + j);
        }
        //System.out.println(map);
        int[][] arr = new int[map.size()][2];
        int t = 0;
        for(int i : map.keySet()){
            int m = map.get(i);
            arr[t][0] = i;
            arr[t++][1] = m;
        }
        return arr;
    }
}