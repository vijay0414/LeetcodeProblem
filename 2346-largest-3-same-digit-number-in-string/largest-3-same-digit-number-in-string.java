class Solution {
    public String largestGoodInteger(String num) {
        List<String> list = List.of("000","111","222","333","444","555","666","777","888","999");
        int max = Integer.MIN_VALUE;
        String str = "";
        for(int i = 0 ; i <= num.length() - 3;i++){
            String sub = num.substring(i , i + 3);
            int ind = list.indexOf(sub);
            if(ind != -1 && (list.get(ind)).equals(sub)){
                int n = Integer.parseInt(sub);
                if(n > max) {
                    max = n;
                    str = sub;
                }
            }
        }
        return str;
    }
}