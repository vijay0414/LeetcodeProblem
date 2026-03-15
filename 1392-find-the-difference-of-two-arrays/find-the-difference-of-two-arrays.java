class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> s1=new HashSet<>();
        for(int i:nums1){
            s.add(i);
        }
        for(int i:nums2){
            s1.add(i);
        }
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> n=new ArrayList<>();
        List<Integer> m=new ArrayList<>();
        for(int i:s){
            if(!s1.contains(i)){
                n.add(i);
            }
        }
        l.add(n);
        for(int i:s1){
            if(!s.contains(i)){
                m.add(i);
            }
        }
        l.add(m);
        return l;

    }
}