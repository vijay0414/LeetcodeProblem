class Solution {
    public int countCommas(int n) {
        if(n < 999) return 0;
        int dif = n - 1000;
        return dif + 1;
    }
}