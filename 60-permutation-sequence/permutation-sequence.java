class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<>();
        int fact = 1;
        for(int i = 1;i < n;i++){
            fact *= i;
            list.add(i);
        }
        list.add(n);
        k--;
        StringBuilder sb = new StringBuilder();
        while(true){
            int ind = k / fact;
            sb.append(list.get(ind));
            list.remove(ind);
            if(list.size() == 0) break;
            k %= fact;
            fact /= list.size();
        }
        return sb.toString();
    }

    // public static String permutation(String p, String up, int k) {
    //     if (!ans.isEmpty())
    //         return ans;
    //     if (up.isEmpty()) {
    //         count++;
    //         if (count == k) {
    //             ans = p;
    //         }
    //         return ans;
    //     }
    //     char c = up.charAt(0);
    //     for (int i = 0; i <= p.length(); i++) {
    //         String l = p.substring(0, i);
    //         String r = p.substring(i);
    //         permutation(l + c + r, up.substring(1), k);
    //         if (!ans.isEmpty())
    //             return ans;
    //     }
    //     return ans;
    // }
}