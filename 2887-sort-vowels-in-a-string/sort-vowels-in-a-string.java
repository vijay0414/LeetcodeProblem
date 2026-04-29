class Solution {
    public String sortVowels(String s) {
       List<Character> n=new ArrayList<>();
       String v="AEIOUaeiou";
       for(char c:s.toCharArray()){
        if(v.indexOf(c)!=-1){
            n.add(c);
        }
       }
       Collections.sort(n);
       StringBuilder sb=new StringBuilder();
       int i=0;
       for(char c:s.toCharArray()){
        if(v.indexOf(c)!=-1){
            sb.append(n.get(i++));
        }else{
            sb.append(c);
        }
       }
       return sb.toString();
    }
}