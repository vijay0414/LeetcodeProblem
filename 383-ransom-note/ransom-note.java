class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(char m : ransomNote.toCharArray()){
            freq[m - 'a']++;
        }
        for(char m : magazine.toCharArray()){
            freq[m - 'a']--;
        }
        for(int i : freq){
            if(i > 0){
                return false;
            }
        }
        return true;
    }
}