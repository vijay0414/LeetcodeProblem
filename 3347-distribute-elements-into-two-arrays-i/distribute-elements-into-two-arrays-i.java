class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list.add(nums[0]);
        list1.add(nums[1]);

        for(int i = 2;i < nums.length;i++){
            if(list.get(list.size() - 1) > list1.get(list1.size() - 1)) list.add(nums[i]);
            else list1.add(nums[i]);
        }

        int  j = 0;
        for(int i : list){
            nums[j++] = i;
        }
        for(int i : list1){
            nums[j++] = i;
        }
        return nums;
    }
}