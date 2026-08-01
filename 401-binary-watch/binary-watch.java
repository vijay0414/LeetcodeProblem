class Solution {
    public List<String> readBinaryWatch(int t) {
        List<String> list = new ArrayList<>();
        for(int h = 0; h < 12;h++){
            StringBuilder sb = new StringBuilder();
            int a = Integer.bitCount(h);
            for(int m = 0 ; m < 60;m++){
                int b = Integer.bitCount(m);
                if((a+b) == t){
                    sb.append(h + "");
                    sb.append(":");
                    if(m < 10){
                        sb.append("0");
                        sb.append(m + "");
                    }else{
                        sb.append(m+"");
                    }
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        return list;
    }
}