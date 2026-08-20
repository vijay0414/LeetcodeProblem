class Solution {
    public String toGoatLatin(String sentence) {
        String str = "maa";
        String[] arr = sentence.split(" ");
        String vow = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            char c = i.charAt(0);
            if(vow.indexOf(c) == -1){
                i+=c;
                sb.append(i.substring(1)).append(str).append(" ");
                str+='a';
            }else{
                sb.append(i).append(str).append(" ");
                str+='a';
            }
        }
        return sb.toString().trim();
    }
}