class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            if(i%2==0){
                m.put(i,m.getOrDefault(i,0)+1);
            }
        }
        int max=0,min=-1;
        for(int key:m.keySet()){
           int freq=m.get(key);
            if (freq>max || (freq==max && key<min)) {
                max=freq;
                min=key;
            }
        }
        return min;
    }
}