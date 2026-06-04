class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            String n=Integer.toString(i);
            int m=0;
            if (n.length()<3) continue;
            for(int j=1;j<n.length()-1;j++){
                int a=n.charAt(j-1)-'0';
                int b=n.charAt(j)-'0';
                int c=n.charAt(j+1)-'0';
                if(((b>a && b>c) || (b<a && b<c))){
                    m++;
                }
            }
            count+=m;
        }
        return count;
    }
}