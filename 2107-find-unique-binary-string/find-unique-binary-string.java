class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
       List<Integer> num = new ArrayList<>();
       //int t = 0;
       int max = 0;
       for(String i : nums){
            int m = Integer.parseInt(i,2);
           num.add(m);
           if(m > max){
            max = m;
           }
       }
       System.out.println(num);
       for(int i = 0 ;i <= max+1;i++){
          if(!num.contains(i)){
            String str1 = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
             return str1;
          }
       }
       return "00";
    }
}