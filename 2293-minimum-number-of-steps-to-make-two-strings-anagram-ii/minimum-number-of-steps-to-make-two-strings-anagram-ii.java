class Solution {
    public int minSteps(String s, String t) {
       int[] freq = new int[26];
       int[] freq1 = new int[26];
       for(char c : s.toCharArray()){
        freq[c - 'a']++;
       } 
       for(char c : t.toCharArray()){
        freq1[c - 'a']++;
       } 
       int sum = 0;
       for(int i = 0;i < 26 ;i++){
           int dif = Math.abs(freq[i] - freq1[i]);
           sum += dif;
       }
       return sum;
    }
}