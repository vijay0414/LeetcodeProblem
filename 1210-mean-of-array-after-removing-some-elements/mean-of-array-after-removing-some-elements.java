class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int val=(int)(n*0.05);
        double sum=0;
        for(int i=val;i<n-val;i++){
            sum+=arr[i];
        }
        return sum/(n-2*val);
    }
}