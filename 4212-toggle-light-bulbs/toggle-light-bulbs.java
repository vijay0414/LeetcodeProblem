class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> m=new ArrayList<>();
        int[] n=new int[101];
        for(int i:bulbs){
            n[i]++;
        }
        for(int i=1;i<n.length;i++){
            if(n[i]%2!=0){
                m.add(i);
            }
        }
        return m;
    }
}