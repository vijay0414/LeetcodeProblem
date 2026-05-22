class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] n=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[i][j];
            }
            n[i]=sum;
        }        
        return n;
    }
}