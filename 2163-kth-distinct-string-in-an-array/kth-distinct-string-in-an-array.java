class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> m=new LinkedHashMap<>();
        for(String s:arr){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        int j=0;
        for(String ky:m.keySet()){
            if(m.get(ky)==1 && (--k)==0){
                return ky;
            }
        }
        return "";
    }
}