class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0])); //sort based in the X axis 

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < points.length;i++){
            int m = points[i][0] - points[i  -1][0];
            max = Math.max(max,m);
        }

        return max;
    }
}