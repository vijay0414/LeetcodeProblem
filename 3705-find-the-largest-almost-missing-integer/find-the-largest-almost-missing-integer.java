class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int l = 0; l <= nums.length - k; l++){
            HashSet<Integer> st = new HashSet<>();
            for(int j = l;j < l + k ;j++){
               st.add(nums[j]);
            }


            for(int j : st){
                map.put(j , map.getOrDefault(j , 0) + 1);
            }
        }

        int max = -1;
        for(int i : map.keySet()){
            int val = map.get(i);
            if(val == 1 && i > max) max = i;
        }
        System.out.println(map);
        return max;
    }
}