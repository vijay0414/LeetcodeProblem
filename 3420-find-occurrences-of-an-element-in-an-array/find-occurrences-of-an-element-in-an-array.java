class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
        List<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                n.add(i);
            }
        }
        int[] m=new int[q.length];
        for(int i=0;i<q.length;i++){
            if(q[i]>n.size()){
                m[i]=-1;
            }
            else{
                m[i]=n.get(q[i]-1);
            }
        }
        return m;
    }
}