class Solution {
    public String reverseWords(String s) {
        String[] n=s.split("\\s+");
        String m=n[0];
        int count=0;
        for (char c:m.toCharArray()) {
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                count++;
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(n[0]);
        for (int i=1;i<n.length;i++) {
            int cc=0;
            for (char c:n[i].toCharArray()) {
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                    cc++;
                }
            }
            char[] k=n[i].toCharArray();
            if (cc==count) {
                int j=0,l=k.length-1;
                while (j<l) {
                    char t=k[j];
                    k[j]=k[l];
                    k[l]=t;
                    j++;
                    l--;
                }
            }
            sb.append(" ").append(new String(k));
        }
        return sb.toString();
    }
}