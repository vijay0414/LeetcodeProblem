class Solution {
    public int[] sortByBits(int[] arr) {
        // Map<Integer,Integer> map = new HashMap<>();

        // for(int i : arr){
        //     int n = Integer.bitCount(i);
        //     map.put(i,n);
        // }
        // System.out.println(map.toString());
        // int[] arr1 = new int[arr.length];
        // int t = 0;
        // for(int i : map.keySet()){
        //     int val = map.get(i);
        //     int k = i;
        //     for(int j : map.keySet()){
        //         if((val > map.get(j) && map.get(j) != -1) || (val == map.get(j) && k > j)){
        //             k = j;
        //             val = map.get(j);
        //         }
        //     }
        //     map.put(k,-1);
        //     arr1[t++] = k;
        // }
        // System.out.println(map.toString());
        // return arr1;

        int[] bit = new int[arr.length];
        int[] res = new int[arr.length];
        int t = 0;
        for (int i : arr) {
            bit[t++] = Integer.bitCount(i);
        }
        t = 0;
        for (int i = 0; i < arr.length; i++) {
            int bitc = Integer.MAX_VALUE;
            int n = Integer.MAX_VALUE;
            int ind = -1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == -1)
                    continue;
                if (bit[j] < bitc || (bit[j] == bitc && arr[j] < n)) {
                    bitc = bit[j];
                    n = arr[j];
                    ind = j;
                }
            }
            arr[ind] = -1;
            res[t++] = n;
        }
        return res;
    }
}