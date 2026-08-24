class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        // for(int i = 0 ; i < nums.length;i++){
        //     HashMap<Integer,Integer> map = new HashMap<>();
        //     for(int j = i + 1; j < nums.length;j++){
        //         int c = -(nums[i] + nums[j]);
        //         if(map.containsKey(c)){
        //             List<Integer> ad = Arrays.asList(nums[i],nums[j],c);
        //             Collections.sort(ad);
        //             list.add(ad);
        //         }
        //         map.put(nums[j],j);
        //     }
        // }
        // return new ArrayList<>(list);

        // for(int i = 0 ; i < nums.length - 2;i++){
        //     if (nums[i] > 0) break;
        //     if(i > 0 && nums[i] == nums[i - 1]){
        //         continue;
        //     }

        //     int l = i + 1;
        //     int r = nums.length - 1;
        //     while(l < r){
        //         int sum = nums[i] + nums[l] + nums[r];
        //         if(sum == 0){
        //             List<Integer> li = Arrays.asList(nums[i] , nums[l] , nums[r]);
        //             list.add(li);
        //         
        //             while(l < r && nums[l] == nums[l + 1]) l++;
        //             while(l < r && nums[r] == nums[r - 1]) r--;
                       //l++;
        //             r--;
        //         }else if (sum < 0) l++;
        //         else r--;
        //     }
        // }
        // return list;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break; // Early exit optimization
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i] , nums[l] , nums[r]);
                    list.add(li);
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return list;
    }
}