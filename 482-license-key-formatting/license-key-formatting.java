class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str  = s.replaceAll("-","");
        str = str.toUpperCase();
        System.out.println(str);
        StringBuilder str1 = new StringBuilder();
        int c = 0;
        for(int i = str.length()-1;i>=0;i--){
            str1.append(str.charAt(i));
            c++;
            if(c == k && i != 0){
                str1.append('-');
                c=0;
            }
        }
        return str1.reverse().toString();
    }
}