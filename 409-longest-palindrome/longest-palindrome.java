class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int len = 0;
        boolean flag = false;
        for(char c : map.keySet()){
            int val = map.get(c);
            if(val % 2 != 0){
                len += (val - 1);
                flag = true;
            }else{
                len += val;
            }
        }
        return flag ? len + 1 : len; 
    }
}