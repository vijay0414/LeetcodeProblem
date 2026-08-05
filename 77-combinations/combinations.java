class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        getcombination(n,1,k,list,new ArrayList<>());
        return list;
    }
    public static void getcombination(int n , int st , int k , List<List<Integer>> list,List<Integer> l){
        if(l.size() == k){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i = st;i < n + 1;i++){
            l.add(i);
            getcombination(n,i + 1,k,list,l);
            l.remove(l.size() - 1);
        }
    }
}