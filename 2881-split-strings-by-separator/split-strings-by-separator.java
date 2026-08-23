class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char s) {
      List<String> n=new ArrayList<>();
      for(int i=0;i<words.size();i++){
        String str = words.get(i);
         StringBuilder sb = new StringBuilder();
         for(int j = 0; j < str.length();j++){
            char ch = str.charAt(j);
            if(ch == s){
                if(sb.length() != 0){
                     n.add(sb.toString());
                    sb.setLength(0);
                }
            }else{
                sb.append(ch);
            }
         }
         if(sb.length() != 0) n.add(sb.toString());
      }
      return n;
    }
}