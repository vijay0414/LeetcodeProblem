class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> n=new TreeSet<>();
        for(int i:nums){
            n.add(i);
        }
        if(n.size()<3){
            return n.last();//It gives the  largest element in the treeset or last element;;
        }
        n.remove(n.last());//reomves largest element in tree set or last element;;
        n.remove(n.last());//reomves largest element in tree set or last element;;
        return n.last();
    }
}