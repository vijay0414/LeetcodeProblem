class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(0,target,can,list,new ArrayList<>());
        return list;
    }

    public void backtrack(int st,int tar,int[] can,List<List<Integer>> list,List<Integer> l){
        if(tar == 0){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i = st;i < can.length ;i++){
            if(can[i] > tar) continue;
            l.add(can[i]);
            backtrack(i,tar - can[i],can,list,l);
            l.remove(l.size() - 1);
        }
    }
}