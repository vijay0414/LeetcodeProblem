class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int end = intervals[0][1];
        int c = 0;
        for(int i = 1 ; i < intervals.length;i++){
            int st = intervals[i][0];
            if(st < end) c++;
            else end = intervals[i][1];
        }
        return c;
    }
}