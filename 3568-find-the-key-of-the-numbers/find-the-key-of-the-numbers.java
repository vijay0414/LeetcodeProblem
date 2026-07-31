class Solution {
    public int generateKey(int n, int m, int x) {
        int min = 0,p = 1;
        while (n != 0 || m != 0 || x != 0) {
            int d = n % 10;
            int d1 = m % 10;
            int d2 = x % 10;
            min += p * Math.min(d, Math.min(d1, d2));
            p *= 10;
            n /= 10;
            m /= 10;
            x /= 10;

        }
        return min;
    }

}