class Solution {
    public int secondHighest(String s) {
        //   List<Integer> list = new ArrayList<>();
        //   for(char c : s.toCharArray()){
        //     if(Character.isDigit(c) && !list.contains(c - '0')){
        //         list.add(c - '0');
        //     }
        //   }
        //   Collections.sort(list);
        //   if(list.size() <= 1) return -1;
        //   return list.get(list.size() - 2);

        int min = -1, secmin = -1;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int m = c - '0';
                if (m > min) {
                    secmin = min;
                    min = m;
                } else if (m != min && m > secmin) {
                    secmin = m;
                }
            }
        }
        return secmin;
    }
}