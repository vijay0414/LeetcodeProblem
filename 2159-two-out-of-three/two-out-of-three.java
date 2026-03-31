class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        HashSet<Integer> n3=new HashSet<>();
        for(int i:nums1) n1.add(i);
        for(int i:nums2) n2.add(i);
        for(int i:nums3) n3.add(i);
        HashSet<Integer> all=new HashSet<>();
        all.addAll(n1);
        all.addAll(n2);
        all.addAll(n3);
        List<Integer> m=new ArrayList<>();
        for(int i:all){
            int c=0;
            if(n1.contains(i)) c++;
            if(n2.contains(i)) c++;
            if(n3.contains(i)) c++;
            if(c>=2){
                m.add(i);
            }
        }
        return m;

    }
}