class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0, c = 0,l=0;
        for(int r = 0; r < n;r++){
            sum += arr[r];
            int m = sum;
            System.out.println(sum);
            if(r >= k -1){
                int avg = m / k;
                if(avg >= threshold) c++;
                sum -= arr[l++]; 
            }
        }
        return c;
    }
}