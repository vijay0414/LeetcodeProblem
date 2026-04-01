class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i : arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int n=arr.length;
        int val=n/4;
        System.out.println(val);
        for(int i:m.keySet()){
            if(m.get(i)>val){
                return i;
            }
        }
        return -1;
    }
}