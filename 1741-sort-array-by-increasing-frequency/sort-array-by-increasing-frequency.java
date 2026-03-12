class Solution {
    public int[] frequencySort(int[] nums) {
       Map<Integer,Integer> m=new HashMap<>();
       for(int i:nums){
        m.put(i,m.getOrDefault(i,0)+1);
       }
       int[] a=new int[nums.length];
       int in=0;
       for(int i=0;i<m.size();i++){
        int min=Integer.MAX_VALUE;
        int n=0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()!=-1 && (e.getValue()<min || (e.getValue()==min && e.getKey()>n))){
                min=e.getValue();
                n=e.getKey();
            }
        }
        m.put(n,-1);
        for(int j=0;j<min;j++){
            a[in++]=n;
        }
       }
       return a;
    }
}