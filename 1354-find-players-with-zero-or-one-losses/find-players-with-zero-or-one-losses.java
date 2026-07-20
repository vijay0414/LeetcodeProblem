class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> win = new HashMap<>();
        Map<Integer, Integer> loss = new HashMap<>();

        List<List<Integer>> list = new ArrayList<>();

        for(int[] i : matches){
            win.put(i[0],win.getOrDefault(i[0],0) + 1);
            loss.put(i[1],loss.getOrDefault(i[1],0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        List<Integer> los = new ArrayList<>();

        for(int i : win.keySet()){
            if(!loss.containsKey(i)){
                l.add(i);
            }
        }

        for(int i : loss.keySet()){
             if(loss.get(i) == 1){
                    los.add(i);
                }
        }

        Collections.sort(l);
        Collections.sort(los);
        list.add(l);
        list.add(los);
        return list;
    }
}