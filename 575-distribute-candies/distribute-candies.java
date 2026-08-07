class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> st =  new HashSet<>();
        for(int i : candyType){
            st.add(i);
        }
        return Math.min(st.size() , candyType.length / 2);
    }
}