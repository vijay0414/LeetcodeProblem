class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int div = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        
        for(int m : map.keySet()){
            if(map.get(m) > div){
                list.add(m);
            }
        }
        return list;
    }
}