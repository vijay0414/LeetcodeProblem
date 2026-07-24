class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> n=new ArrayList<>();
        int min  = Integer.MAX_VALUE;
        for(int i = 1;i < arr.length ; i++){
            min = Math.min(min,arr[i] - arr[i - 1]);
        }
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] - arr[i - 1] == min){
                List<Integer> m = new ArrayList<>();
                m.add(arr[i - 1]);
                m.add(arr[i]);
                n.add(m);
            }
        }
        return n;
    }
}