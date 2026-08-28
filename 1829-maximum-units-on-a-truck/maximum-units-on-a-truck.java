class Solution {
    public int maximumUnits(int[][] box, int si) {
        Arrays.sort(box , (a,b) -> Integer.compare(b[1],a[1]));
        int sum = 0 ;
        for(int[] i : box){
            int f = i[0];
            int s = i[1];
            if(si >= f) {
                sum += (f * s);
                si -= f;
            }else{
                sum += (si * s);
                break;
            }
        }
        return sum;
    }
}