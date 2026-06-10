class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a=s1.toCharArray();
        Arrays.sort(a);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String s=s2.substring(i,i+s1.length());
            char[] n=s.toCharArray();
            Arrays.sort(n);
            //System.out.println(Arrays.toString(n));
            if(Arrays.equals(a,n)){
                return true;
            }
        }
        return false;
    }
}