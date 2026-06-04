class Solution {
    public int partitionString(String s) {
        List<String> n=new ArrayList<>();
        String m="";
        for(char c:s.toCharArray()){
            if(m.contains(String.valueOf(c))){
                n.add(m);
                m="";
                m+=c;
            }else{
                m+=c;
            }
        }
        n.add(m);
        System.out.println(n);
        return n.size();
    }
}