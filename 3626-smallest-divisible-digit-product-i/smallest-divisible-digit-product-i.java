class Solution {
    public int smallestNumber(int n, int t) {
       
        for(int i = n ; i <= 100;i++){
            int j = i;
            int prod = 1;
            while(j != 0){
                int d = j % 10;
                prod *= d;
                j /= 10;
            }
            if(prod  % t == 0){
                return i;
            }
        }
        return -1;
    }
}