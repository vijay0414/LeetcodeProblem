class Solution {
    public int countWords(String[] words1, String[] words2) {
       Map<String,Integer> m=new HashMap<>();
       Map<String,Integer> n=new HashMap<>();
       int c=0;
       for(String s:words1){
        m.put(s,m.getOrDefault(s,0)+1);
       }
       for(String s:words2){
        if(m.containsKey(s)){
        n.put(s,n.getOrDefault(s,0)+1);
        }
       }
       for(String word:m.keySet()){
        if(m.get(word)==1 && n.getOrDefault(word,0)==1){
            c++;
        }
       }
       return c;
    }
}