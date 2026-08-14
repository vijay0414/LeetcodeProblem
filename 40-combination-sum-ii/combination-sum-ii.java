class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(can);
        backtrack(0,can,target,list,new ArrayList<>());
        return list;
    }

    public void backtrack(int st , int[] can,int tar,List<List<Integer>> list,List<Integer> l){
        if(tar == 0){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int i = st;i < can.length;i++){
            if(can[i] > tar) {
                break;
            }
            if(i > st && can[i] == can[i - 1]) {
                continue;
            }
            l.add(can[i]);
            backtrack(i + 1,can,tar - can[i],list,l);
            l.remove(l.size() - 1);
        }
    }
}