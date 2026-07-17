class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list = new ArrayList<>();
        int m = l.length;
        for(int i = 0 ; i < m;i++){
            int t = 0;
            int[] a = new int[r[i] - l[i] + 1];
            for(int  j = l[i] ; j <= r[i];j++){
                a[t++] = nums[j];
            }
            Arrays.sort(a);
            int ap = a[1] - a[0];
            boolean flag = true;
            for(int k = 1 ; k <  a.length - 1;k++){
                if(a[k + 1] - a[k] != ap){
                    flag = false;
                    break;
                }
            }
            list.add(flag);
        }
        return list;
    }
}